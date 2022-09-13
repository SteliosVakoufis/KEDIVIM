package gr.aueb.elearn.chapter13.exercises.ex2;

public class OverdraftAccount {
    private int balance;

    protected OverdraftAccount(int startingBalance) {
        this.balance = startingBalance;
    }

    protected void withdraw(int amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "OverdraftAccount(" + this.balance + ")\n";
    }

}
