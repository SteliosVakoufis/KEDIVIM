package com.layeredarchitectures.accountapp.service;

import java.util.Optional;

import com.layeredarchitectures.accountapp.dao.IAccountDAO;
import com.layeredarchitectures.accountapp.dto.AccountDTO;
import com.layeredarchitectures.accountapp.model.Account;
import com.layeredarchitectures.accountapp.service.exceptions.AccountAlreadyExists;
import com.layeredarchitectures.accountapp.service.exceptions.AccountDoesNotExist;
import com.layeredarchitectures.accountapp.service.exceptions.InsufficientAccountBalance;
import com.layeredarchitectures.accountapp.service.exceptions.TryingToDepositNegativeAmount;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO dao;

    public AccountServiceImpl(IAccountDAO contactDAO) {
        dao = contactDAO;
    }

    @Override
    public boolean createAccount(AccountDTO accountDTO) throws AccountAlreadyExists {
        try {
            if (dao.createAccount(this.convertAccountDTO(accountDTO))) {
                return true;
            } else {
                throw new AccountAlreadyExists(accountDTO.getId());
            }
        } catch (AccountAlreadyExists e) {
            throw e;
        }
    }

    @Override
    public boolean deleteAccount(long id) throws AccountDoesNotExist {
        try {
            if (dao.deleteAccount(id)) {
                return true;
            } else {
                throw new AccountDoesNotExist(id);
            }
        } catch (AccountDoesNotExist e) {
            throw e;
        }
    }

    @Override
    public Optional<Double> deposit(long id, double amount) throws AccountDoesNotExist, TryingToDepositNegativeAmount {
        try {
            Optional<Double> balance = dao.deposit(id, amount);
            if (balance.isEmpty()) {
                throw new AccountDoesNotExist(id);
            }
            if (balance.get() < 0) {
                throw new TryingToDepositNegativeAmount();
            }
            return balance;
        } catch (AccountDoesNotExist e) {
            throw e;
        } catch (TryingToDepositNegativeAmount e) {
            throw e;
        }
    }

    @Override
    public Optional<Double> getAccountBalance(long id) throws AccountDoesNotExist {
        try {
            Optional<Double> balance = dao.getAccountBalance(id);
            if (balance.isEmpty()) {
                throw new AccountDoesNotExist(id);
            }
            return balance;
        } catch (AccountDoesNotExist e) {
            throw e;
        }
    }

    @Override
    public Optional<String> getAccountState(long id) throws AccountDoesNotExist {
        try {
            Optional<String> accountState = dao.getAccountState(id);
            if (accountState.isEmpty()) {
                throw new AccountDoesNotExist(id);
            }
            return accountState;
        } catch (AccountDoesNotExist e) {
            throw e;
        }
    }

    @Override
    public boolean updateAccount(long id, AccountDTO accountDTO) throws AccountDoesNotExist {
        try {
            boolean success = dao.updateAccount(id, this.convertAccountDTO(accountDTO));
            if (!success) {
                throw new AccountDoesNotExist(id);
            }
            return true;
        } catch (AccountDoesNotExist e) {
            throw e;
        }
    }

    @Override
    public Optional<Double> withdraw(long id, double amount) throws AccountDoesNotExist, InsufficientAccountBalance {
        try {
            Optional<Double> balance = dao.withdraw(id, amount);
            if (balance.isEmpty()) {
                throw new AccountDoesNotExist(id);
            }
            if (balance.get() < 0) {
                throw new InsufficientAccountBalance();
            }
            return balance;
        } catch (AccountDoesNotExist e) {
            throw e;
        } catch (InsufficientAccountBalance e) {
            throw e;
        }
    }

    // Helper functions
    private Account convertAccountDTO(AccountDTO accountDTO) {
        return new Account(
                accountDTO.getId(),
                accountDTO.getIban(),
                accountDTO.getLastName(),
                accountDTO.getFirstName(),
                accountDTO.getSsn(),
                accountDTO.getBalance());
    }
}
