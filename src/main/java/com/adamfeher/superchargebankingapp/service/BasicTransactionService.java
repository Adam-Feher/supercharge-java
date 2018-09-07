package com.adamfeher.superchargebankingapp.service;

import com.adamfeher.superchargebankingapp.model.Account;
import com.adamfeher.superchargebankingapp.model.Transaction;

import java.time.LocalDate;
import java.util.List;

public interface BasicTransactionService {
    List<Transaction> getAllTransactions(Account account);

    List<Transaction> getTransactionsByDate(Account account, LocalDate from, LocalDate to);

    List<Transaction> getTransactionsByType(Account account, Transaction.TransactionDirection type);
}
