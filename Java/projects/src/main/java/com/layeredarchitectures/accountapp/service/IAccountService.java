package com.layeredarchitectures.accountapp.service;

import java.util.Optional;

import com.layeredarchitectures.accountapp.dto.AccountDTO;
import com.layeredarchitectures.accountapp.service.exceptions.AccountAlreadyExists;
import com.layeredarchitectures.accountapp.service.exceptions.AccountDoesNotExist;
import com.layeredarchitectures.accountapp.service.exceptions.InsufficientAccountBalance;
import com.layeredarchitectures.accountapp.service.exceptions.TryingToDepositNegativeAmount;

public interface IAccountService {
    boolean createAccount(AccountDTO accountDTO) throws AccountAlreadyExists;

    boolean deleteAccount(long id) throws AccountDoesNotExist;

    Optional<Double> deposit(long id, double amount) throws AccountDoesNotExist, TryingToDepositNegativeAmount;

    Optional<Double> getAccountBalance(long id) throws AccountDoesNotExist;

    Optional<String> getAccountState(long id) throws AccountDoesNotExist;

    boolean updateAccount(long id, AccountDTO accountDTO) throws AccountDoesNotExist;

    Optional<Double> withdraw(long id, double amount) throws AccountDoesNotExist, InsufficientAccountBalance;
}
