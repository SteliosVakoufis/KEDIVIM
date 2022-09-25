package account.dao;

import java.util.Optional;

import account.model.AccountInfo;
import account.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account implements IAccount {
    private User holder = new User();
    private AccountInfo accnfo = new AccountInfo();

    protected Account(AccountInfo accnfo) {
        this.accnfo = accnfo;
    }

    @Override
    public Optional<Double> deposit(double amount) {
        if (amount < 0)
            return Optional.of(-1d);
        double newAmount = this.accnfo.getBalance() + amount;
        this.accnfo.setBalance(newAmount);
        return Optional.of(newAmount);
    }

    @Override
    public Optional<Double> withdraw(double amount) {
        double newAmount = this.accnfo.getBalance() - amount;
        if (newAmount < 0)
            return Optional.of(-1d);
        this.accnfo.setBalance(newAmount);
        return Optional.of(newAmount);
    }

    @Override
    public Optional<Double> getAccountBalance() {
        return Optional.of(accnfo.getBalance());
    }

    @Override
    public boolean isSsnValid(String ssn) {
        return this.holder.getSsn().equals(ssn);
    }

    @Override
    public boolean isValidIban(String iban) {
        return this.accnfo.getIban().equals(iban);
    }
    
}
