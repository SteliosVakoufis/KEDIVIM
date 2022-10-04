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
public class OverdraftAccount extends AbstractEntity{
    private String iban;
    private User holder;
    private Double balance;

    public OverdraftAccount(Long id, String iban, User holder, Double balance) {
        super.setId(id);
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }
}
