package com.adamfeher.superchargebankingapp.service;

import com.adamfeher.superchargebankingapp.model.Account;

import java.math.BigDecimal;

public class AccountService implements BasicAccountService {

    @Override
    public void deposit(Account account, BigDecimal amount) {
        if (!checkAmountIsNotLessThanZero(amount)) {
            throw new IllegalArgumentException("Deposit amount can't be less than or equal to 0");
        }else{
            account.setBalance(account.getBalance().add(amount));
        }

    }

    @Override
    public void withdrawal(Account account, BigDecimal amount) {
        if (!checkAmountIsNotLessThanZero(amount)) {
            throw new IllegalArgumentException("You can't withdraw negative amount");
        } else if (!checkBalanceNotExceedZero(account,amount)) {
            throw new IllegalArgumentException("You can't withdraw this amount because it exceed your balance");
        } else {
            account.setBalance(account.getBalance().subtract(amount));
        }
    }


    private boolean checkAmountIsNotLessThanZero(BigDecimal amount) {
        return amount.compareTo(BigDecimal.ZERO) <= 0;
    }

    private boolean checkBalanceNotExceedZero(Account account, BigDecimal amount) {
        return account.getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0;
    }
}
