package gr.aueb.elearn.chapter13.exercises.ex2;

import java.util.ArrayList;

public class JointAccount extends OverdraftAccount{
    private ArrayList<User> owners;

    public JointAccount(int balance, User... users){
        super(balance);
        owners = new ArrayList<>();
        for (User user : users) {
            this.owners.add(user.copy());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "JointAccount(" + this.owners.toString() + ")\n";
    }

}
