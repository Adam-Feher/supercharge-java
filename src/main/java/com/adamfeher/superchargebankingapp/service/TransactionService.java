package com.adamfeher.superchargebankingapp.service;

import com.adamfeher.superchargebankingapp.model.Account;
import com.adamfeher.superchargebankingapp.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionService implements BasicTransactionService {
    private AccountService accountService;

    public TransactionService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public List<Transaction> getAllTransactions(Account account) {
        return account.getTransactions();
    }

    @Override
    public List<Transaction> getTransactionsByDate(Account account, LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public List<Transaction> getTransactionsByType(Account account, Transaction.TransactionDirection type) {
        return account.getTransactions().stream()
                .filter(transaction -> type.equals(transaction.getType()))
                .collect(Collectors.toList());
    }

    @Override
    public void transfer(Account senderAccount, Account receiverAccount, BigDecimal amount) {
        if (!checkIfValidTransfer(senderAccount,amount)) {
            throw new IllegalArgumentException("Amount is wrong or exceed sender limits");
        } else {
            senderAccount.setBalance(senderAccount.getBalance().subtract(amount));
            receiverAccount.setBalance(receiverAccount.getBalance().add(amount));
            senderAccount.getTransactions().add(new Transaction(amount,senderAccount.getBalance(),Transaction.TransactionDirection.WITHDRAWAL));
            receiverAccount.getTransactions().add(new Transaction(amount,receiverAccount.getBalance(),Transaction.TransactionDirection.DEPOSIT));
        }

    }

    private boolean checkIfValidTransfer(Account sender, BigDecimal amount) {
        return accountService.checkAmountIsNotLessThanZero(amount) && accountService.checkBalanceNotExceedZero(sender, amount);
    }
}
