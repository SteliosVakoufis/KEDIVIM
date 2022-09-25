package com.layeredarchitectures.accountapp.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Account {
    private long id;
    private String iban;
    private String lastName;
    private String firstName;
    private String ssn;
    private double balance;

    public Account(Account account) {
        this.id = account.id;
        this.iban = account.iban;
        this.lastName = account.lastName;
        this.firstName = account.firstName;
        this.ssn = account.ssn;
        this.balance = account.balance;
    }
}
