package account.service.exceptions;

public class AccountAlreadyExistsException extends Exception{
    public AccountAlreadyExistsException() {
        super("Account already exists, insert a different iBan!");
    }
}
