package account.service.exceptions;

public class NotEnoughBalanceException extends Exception{

    public NotEnoughBalanceException() {
        super("Not enough balance in the account!");
    }
    
}

