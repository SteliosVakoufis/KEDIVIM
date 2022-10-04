package gr.aueb.elearn.chapter17.accounts.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper=true)
public class User extends AbstractEntity {
    private String firstName;
    private String lastName;
    private String ssn;
    
    public User(Long id,String firstName, String lastName, String ssn) {
        super.setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public User(User user) {
        this.setId(user.getId());
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setSsn(user.getSsn());
    }
}
