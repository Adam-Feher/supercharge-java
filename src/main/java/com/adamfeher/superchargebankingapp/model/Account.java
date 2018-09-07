package com.adamfeher.superchargebankingapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private static long idCounter = 0;
    private long id;
    private User owner;
    private BigDecimal balance;
    private List<Transaction> transactions;

    public Account(User owner) {
        this.id = idCounter++;
        this.owner = owner;
        this.balance = BigDecimal.ZERO;
        this.transactions = new ArrayList<>();
    }


    public long getId() {
        return id;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
