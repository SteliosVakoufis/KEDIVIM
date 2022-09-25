package account.service.exceptions;

public class NegativeAmountInsertedException extends Exception {

    public NegativeAmountInsertedException() {
        super("A negative amount was given for deposit!");
    }

}
