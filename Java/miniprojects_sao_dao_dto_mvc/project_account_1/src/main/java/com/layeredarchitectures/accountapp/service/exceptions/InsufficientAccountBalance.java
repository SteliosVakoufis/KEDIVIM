package com.layeredarchitectures.accountapp.service.exceptions;

public class InsufficientAccountBalance extends Exception{
    public InsufficientAccountBalance() {
        super("Insufficient account balance!");
    }
}
