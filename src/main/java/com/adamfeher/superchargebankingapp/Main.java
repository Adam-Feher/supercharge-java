package com.adamfeher.superchargebankingapp;

import com.adamfeher.superchargebankingapp.model.Account;
import com.adamfeher.superchargebankingapp.model.User;
import com.adamfeher.superchargebankingapp.service.AccountService;
import com.adamfeher.superchargebankingapp.service.TransactionService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        User john = new User("John", "john@example.com", "123");
        User andy = new User("Andy", "andy@example.com", "1234");
        Account accountOfJohn = new Account(john);
        Account accountOfAndy = new Account(andy);

        AccountService accountService = new AccountService();
        TransactionService transactionService = new TransactionService(accountService);

        accountService.deposit(accountOfJohn, BigDecimal.valueOf(10000));
        accountService.deposit(accountOfAndy, BigDecimal.valueOf(20000));
        System.out.println(accountOfAndy.getBalance());
        System.out.println(accountOfJohn.getBalance());
        accountService.withdrawal(accountOfJohn, BigDecimal.valueOf(1000));
        accountService.withdrawal(accountOfAndy, BigDecimal.valueOf(5000));
        System.out.println(accountOfAndy.getBalance());
        System.out.println(accountOfJohn.getBalance());
        transactionService.transfer(accountOfJohn, accountOfAndy, BigDecimal.valueOf(2000));
        System.out.println(accountOfAndy.getBalance());
        System.out.println(accountOfJohn.getBalance());
    }
}
