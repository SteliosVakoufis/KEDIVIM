package com.bankaccounts.model;

import com.bankaccounts.dto.UserDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class User extends IdentifiableEntity {
    private String firstName;
    private String lastName;
    private String ssn;

    public User(long id, String firstName, String lastName, String ssn) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public User(User user) {
        super(user.getId());
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.ssn = user.getSsn();
    }

    public User(UserDTO userDTO) {
        super(userDTO.getId());
        this.firstName = userDTO.getFirstName();
        this.lastName = userDTO.getLastName();
        this.ssn = userDTO.getSsn();
    }
}
