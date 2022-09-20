package com.layeredarchitectures.accountapp.service.exceptions;

public class AccountDoesNotExist extends Exception{
    public AccountDoesNotExist(long id) {
        super("Account with id " + id + " does not exist!");
    }
}
