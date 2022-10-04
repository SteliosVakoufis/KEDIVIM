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
public class Account extends AbstractEntity{
    private String iban;
    private User holder;
    private Double balance;

    public Account(Long id, User holder, String iban, Double balance) {
        super.setId(id);
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }
}
