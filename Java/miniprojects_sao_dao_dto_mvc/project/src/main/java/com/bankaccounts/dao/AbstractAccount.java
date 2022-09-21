package com.bankaccounts.dao;

import java.util.Optional;

abstract class AbstractAccount implements IAccount {

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
    public Optional<Boolean> isSsnValid(String ssn) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Boolean> withdraw(double amount, String ssn) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

}
