package com.adamfeher.superchargebankingapp.service;

import com.adamfeher.superchargebankingapp.model.Account;
import com.adamfeher.superchargebankingapp.model.Transaction;

import java.time.LocalDate;
import java.util.List;

public class TransactionService implements BasicTransactionService{
    @Override
    public List<Transaction> getAllTransactions(Account account) {
        return null;
    }

    @Override
    public List<Transaction> getTransactionsByDate(Account account, LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public List<Transaction> getTransactionsByType(Account account, Transaction.TransactionDirection type) {
        return null;
    }
}
