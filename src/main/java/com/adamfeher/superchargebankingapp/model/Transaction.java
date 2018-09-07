package com.adamfeher.superchargebankingapp.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private static long idCounter = 0;
    private long id;
    private LocalDateTime date;
    private BigDecimal amount;
    private BigDecimal currentBalance;
    private TransactionDirection type;

    public enum TransactionDirection {
        DEPOSIT,
        WITHDRAWAL,
    }

    public Transaction(BigDecimal amount, BigDecimal currentBalance, TransactionDirection type) {
        this.id = idCounter++;
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.currentBalance = currentBalance;
        this.type = type;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public TransactionDirection getType() {
        return type;
    }

    public void setType(TransactionDirection type) {
        this.type = type;
    }
}
