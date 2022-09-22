package account.dao;

import java.util.Optional;
import account.model.AccountInfo;
import account.model.User;

public class OverdraftAccount extends Account {

    public OverdraftAccount(User holder, AccountInfo accnfo) {
        super(holder, accnfo);
    }

    @Override
    public Optional<Double> withdraw(double amount) {
        double newAmount = this.getAccnfo().getBalance() - amount;
        this.getAccnfo().setBalance(newAmount);
        return Optional.of(0d);
    }
}
