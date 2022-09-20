package com.layeredarchitectures.accountapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.layeredarchitectures.accountapp.model.Account;

public class AccountDAOImpl implements IAccountDAO {
    private List<Account> accounts = new ArrayList<>();

    @Override
    public boolean createAccount(Account account) {
        if (!accountExists(account)) {
            this.accounts.add(new Account(account));
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteAccount(long id) {
        int index = getAccountPos(id);
        if (index != -1) {
            this.accounts.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Double> deposit(long id, double amount) {
        int index = getAccountPos(id);
        if (index != -1) {
            if (amount > 0) {
                double balance = this.accounts.get(index).getBalance();
                double newBalance = balance + amount;
                this.accounts.get(index).setBalance(newBalance);
                return Optional.of(newBalance);
            }
            return Optional.of(amount);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Double> getAccountBalance(long id) {
        int index = getAccountPos(id);
        if (index != -1) {
            return Optional.of(this.accounts.get(index).getBalance());
        }
        return Optional.empty();
    }

    @Override
    public Optional<String> getAccountState(long id) {
        int index = getAccountPos(id);
        if (index != -1) {
            return Optional.of(this.accounts.get(index).toString());
        }
        return Optional.empty();
    }

    @Override
    public boolean updateAccount(long id, Account account) {
        int index = getAccountPos(id);
        if (index != -1) {
            this.accounts.remove(index);
            this.accounts.add(new Account(account));
            return true;
        }
        return false;
    }

    @Override
    public Optional<Double> withdraw(long id, double amount) {
        int index = getAccountPos(id);
        if (index != -1) {
            double balance = this.accounts.get(index).getBalance();
            double newBalance = balance - amount;
            if (balance >= amount) {
                this.accounts.get(index).setBalance(newBalance);
            }
            return Optional.of(newBalance);
        }
        return Optional.empty();
    }

    // Helper functions
    private int getAccountPos(long id) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    private boolean accountExists(Account account) {
        for (Account acc : this.accounts) {
            if (acc.getId() == account.getId())
                return true;
        }
        return false;
    }
}
