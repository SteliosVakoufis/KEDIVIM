package com.layeredarchitectures.accountapp.service.exceptions;

public class AccountAlreadyExists extends Exception {
    public AccountAlreadyExists(long id) {
        super("Accoun with id " + id + " already exists!");
    }
}
