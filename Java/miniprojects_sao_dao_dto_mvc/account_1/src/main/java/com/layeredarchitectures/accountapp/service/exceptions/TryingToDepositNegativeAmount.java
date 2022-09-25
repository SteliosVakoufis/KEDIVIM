package com.layeredarchitectures.accountapp.service.exceptions;

public class TryingToDepositNegativeAmount extends Exception{
    public TryingToDepositNegativeAmount() {
        super("Trying to deposit negative amount!");
    }
}
