package com.bankaccounts.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountsControllerDAO implements IAccount{
    List<AbstractAccount> accounts = new ArrayList<>();

    @Override
    public Optional<Boolean> deposit(double amount) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public double getAccountBalance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Optional<Boolean> isSsnValid(String ss) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Boolean> withdraw(double amount, String ssn) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
    
}
