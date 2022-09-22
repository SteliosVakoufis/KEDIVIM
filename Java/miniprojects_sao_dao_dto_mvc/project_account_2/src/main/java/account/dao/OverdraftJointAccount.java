package account.dao;

import java.util.Optional;

import account.model.AccountInfo;
import account.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OverdraftJointAccount extends Account {
    private User firstHolder;
    private User secondHolder;

    public OverdraftJointAccount(User firstHolder, User secondHolder, AccountInfo accnfo) {
        super(accnfo);
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
    }

    @Override
    public Optional<Double> withdraw(double amount) {
        double newAmount = this.getAccnfo().getBalance() - amount;
        this.getAccnfo().setBalance(newAmount);
        return Optional.of(0d);
    }

    @Override
    public String toString() {
        return "JointAccount [firstHolder=" + firstHolder + ", secondHolder=" + secondHolder + "]\n"
                + super.toString();
    }
}
