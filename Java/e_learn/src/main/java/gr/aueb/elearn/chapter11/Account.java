package gr.aueb.elearn.chapter11;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
@AllArgsConstructor
public class Account {
    @Setter(AccessLevel.NONE) private long id;
    private String iban;
    private String lastName;
    private String firstName;
    private String ssn;
    private double balance;

    public Account() {
    }

    
    /** 
     * Deposits a specific amount of money
     * 
     * @param amount        amount of money to deposit
     * @throws Exception    throws exception if amount < 0
     */
    public void deposit(double amount) throws Exception {
        if (amount > 0)
            balance += amount;
        else {
            try {
                throw new Exception("Negative amount");
            } catch (Exception e) {
                System.err.println(e);
                throw e;
            }
        }
    }
    
    /** 
     * Withdraws a specific amount of money
     * 
     * @param amount        amount of money to withdraw
     * @throws Exception    throws exception if amount > this.balance
     */
    public void withDraw(double amount) throws Exception {
        if (amount <= this.balance)
            balance -= amount;
        else {
            try {
                throw new Exception("Negative amount");
            } catch (Exception e) {
                System.err.println(e);
                throw e;
            }
        }
    }

    public String getAccountState(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Id: " + this.id +
                "\niban: " + this.iban +
                "\nlastName: " + this.lastName +
                "\nfirstName: " + this.firstName +
                "\nssn: " + this.ssn +
                "\nbalance: " + this.balance;
    }

    public static void main(String[] args) {
        ArrayList<Account> myAccounts = new ArrayList<>();
        Account acc = new Account(
                0,
                "iban",
                "lastName",
                "firstName",
                "ssn",
                100);

        myAccounts.add(acc);

        try {
            acc.deposit(100);
            acc.withDraw(2000);
        } catch (Exception e) {
            System.out.println("Stop it...");
        }

        System.out.println(myAccounts.get(0).getAccountState());
    }
}
