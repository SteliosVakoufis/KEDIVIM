package com.bankaccounts.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String ssn;

    public UserDTO (UserDTO userDTO){
        this.id = userDTO.getId();
        this.firstName = userDTO.getFirstName();
        this.lastName = userDTO.getLastName();
        this.ssn = userDTO.getSsn();
    }
}
