package com.bankaccounts.dto;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AccountDTO {
    private ArrayList<UserDTO> holder;
    private double balance;

    public AccountDTO(AccountDTO accountDTO) {
        this.holder = new ArrayList<>(accountDTO.getHolder());
        this.balance = accountDTO.getBalance();
    }
}
