package com.adamfeher.superchargebankingapp.service;

import com.adamfeher.superchargebankingapp.model.Account;

import java.math.BigDecimal;

public interface BasicAccountService {
    void deposit(Account account, BigDecimal amount);

    void withdrawal(Account account, BigDecimal amount);

    void transfer(Account senderAccount, Account receiverAccount, BigDecimal amount);
}
