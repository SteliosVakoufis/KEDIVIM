package com.bankaccounts.model;

import java.util.ArrayList;

import com.bankaccounts.dto.AccountDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Account extends IdentifiableEntity {
    private ArrayList<User> holder;
    private double balance;

    public Account(long id, ArrayList<User> holder, double balance) {
        super(id);
        this.holder = new ArrayList<>(holder);
        this.balance = balance;
    }

    public Account(AccountDTO accounDTO) {
        this.holder = new ArrayList<>(accounDTO.getHolder());
        this.balance = accounDTO.getBalance();
    }
}
