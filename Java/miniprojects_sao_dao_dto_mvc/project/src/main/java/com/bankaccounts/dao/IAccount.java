package com.bankaccounts.dao;

import java.util.Optional;

public interface IAccount {
    long id = 0;
    double balance = 0;

    Optional<Boolean> deposit(double amount);

    Optional<Boolean> withdraw(double amount, String ssn);

    Optional<Boolean> isSsnValid(String ssn);

    double getAccountBalance();
}
