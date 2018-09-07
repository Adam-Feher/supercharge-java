package com.adamfeher.superchargebankingapp.service;

import com.adamfeher.superchargebankingapp.model.Account;

import java.math.BigDecimal;

public class AccountService implements BasicAccountService {

    @Override
    public void deposit(Account account, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit amount can't be less than or equal to 0");
        }else{
            account.setBalance(account.getBalance().add(amount));
        }

    }

    @Override
    public void withdrawal(Account account, BigDecimal amount) {

    }

    @Override
    public void transfer(Account senderAccount, Account receiverAccount, BigDecimal amount) {

    }
}
