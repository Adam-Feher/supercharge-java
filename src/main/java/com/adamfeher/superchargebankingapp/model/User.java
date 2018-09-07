package com.adamfeher.superchargebankingapp.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static long idCounter = 0;
    private long id;
    private final String name;
    private String email;
    private String phoneNumber;
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public User(String name, String email, String phoneNumber) {
        this.id = idCounter++;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
