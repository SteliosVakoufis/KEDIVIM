package com.layeredarchitectures.accountapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountDTO {
    private long id;
    private String iban;
    private String lastName;
    private String firstName;
    private String ssn;
    private double balance;
}
