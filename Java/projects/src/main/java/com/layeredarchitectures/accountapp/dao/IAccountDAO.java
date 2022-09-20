package com.layeredarchitectures.accountapp.dao;

import java.util.Optional;

import com.layeredarchitectures.accountapp.model.Account;

public interface IAccountDAO {
    Optional<Double> deposit(long id, double amount);

    Optional<Double> withdraw(long id, double amount);

    boolean createAccount(Account account);

    boolean deleteAccount(long id);

    boolean updateAccount(long id, Account account);

    Optional<Double> getAccountBalance(long id);

    Optional<String> getAccountState(long id);
}
