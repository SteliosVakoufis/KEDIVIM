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
public class OverdraftJointAccount extends AbstractEntity{
    private User firstHolder;
    private User secondHolder;
    private String iban;
    private Double balance;

    public OverdraftJointAccount(Long id, User firstHolder, User secondHolder, String iban, Double balance) {
        super.setId(id);
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
        this.iban = iban;
        this.balance = balance;
    }
}
