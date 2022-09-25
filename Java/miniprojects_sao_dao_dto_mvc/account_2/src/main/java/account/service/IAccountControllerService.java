package account.service;

import java.util.List;

import account.dto.AccountInfoDTO;
import account.dto.UserDTO;
import account.service.exceptions.AccountAlreadyExistsException;
import account.service.exceptions.AccountNotFoundException;
import account.service.exceptions.AccountTypeNotFoundException;
import account.service.exceptions.IncorrectAmountOfUsersException;
import account.service.exceptions.NegativeAmountInsertedException;
import account.service.exceptions.NotEnoughBalanceException;

public interface IAccountControllerService {
        boolean addAccount(List<UserDTO> usersDTO, AccountInfoDTO accnfoDTO, String accountType)
                        throws AccountTypeNotFoundException, IncorrectAmountOfUsersException,
                        AccountAlreadyExistsException;

        double withdraw(String iban, double amount)
                        throws AccountNotFoundException, NotEnoughBalanceException;

        double deposit(String iban, double amount)
                        throws AccountNotFoundException, NegativeAmountInsertedException;

        String getInfo(String iban)
                        throws AccountNotFoundException;

        boolean deleteAccount(String iban)
                        throws AccountNotFoundException;
}
