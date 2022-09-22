package account.service.exceptions;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException() {
        super("Account does not exist!");
    }

}
