package account.dao;

import account.model.AccountInfo;
import account.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JointAccount extends Account {
    private User firstHolder;
    private User secondHolder;

    public JointAccount(User firstHolder, User secondHolder, AccountInfo accnfo) {
        super(accnfo);
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
    }

    @Override
    public String toString() {
        return "JointAccount [firstHolder=" + firstHolder + ", secondHolder=" + secondHolder + "]\n"
                + super.toString();
    }
}
