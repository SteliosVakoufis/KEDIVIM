package gr.aueb.elearn.chapter11and12;

public class InsuficientBalanceException extends Exception {
    public InsuficientBalanceException(double balance, double amount) {
        super("Insuficient balance " + balance + " for amount " + amount);
    }
}
