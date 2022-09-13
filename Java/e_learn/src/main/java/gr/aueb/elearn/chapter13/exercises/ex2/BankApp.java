package gr.aueb.elearn.chapter13.exercises.ex2;

public class BankApp {

    public static void main(String[] args) {
        JointAccount myAccount = new JointAccount(
                1000,
                new User("John", "Snow"),
                new User("John", "Doe"));

        System.out.println(myAccount);

        myAccount.withdraw(2000);

        System.out.println(myAccount);

    }

}
