package account.service.exceptions;

public class AccountTypeNotFoundException extends Exception {

    public AccountTypeNotFoundException() {
        super("Account type is incorrect!");
    }
    
}
