package account.service.exceptions;

public class IncorrectAmountOfUsersException extends Exception {

    public IncorrectAmountOfUsersException() {
        super("Wrong amount of users was given for this type of Account!");
    }
    
}
