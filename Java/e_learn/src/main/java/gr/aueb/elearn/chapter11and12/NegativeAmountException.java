package gr.aueb.elearn.chapter11and12;

public class NegativeAmountException extends Exception{
    
    public NegativeAmountException(double amount) {
        super("Negative amount " + amount);
    }

}
