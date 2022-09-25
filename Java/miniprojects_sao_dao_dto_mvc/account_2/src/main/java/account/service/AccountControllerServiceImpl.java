package account.service;

import java.util.List;
import java.util.Optional;

import account.dao.Account;
import account.dao.IAccountsControllerDAO;
import account.dao.JointAccount;
import account.dao.OverdraftAccount;
import account.dao.OverdraftJointAccount;
import account.dto.AccountInfoDTO;
import account.dto.UserDTO;
import account.model.AccountInfo;
import account.model.User;
import account.service.exceptions.AccountAlreadyExistsException;
import account.service.exceptions.AccountNotFoundException;
import account.service.exceptions.AccountTypeNotFoundException;
import account.service.exceptions.IncorrectAmountOfUsersException;
import account.service.exceptions.NegativeAmountInsertedException;
import account.service.exceptions.NotEnoughBalanceException;

public class AccountControllerServiceImpl implements IAccountControllerService {
    private IAccountsControllerDAO dao;

    public AccountControllerServiceImpl(IAccountsControllerDAO dao) {
        this.dao = dao;
    }

    @Override
    public boolean addAccount(List<UserDTO> usersDTO, AccountInfoDTO accnfoDTO, String accountType)
            throws AccountTypeNotFoundException, IncorrectAmountOfUsersException, AccountAlreadyExistsException {

        if (dao.ibanExists(accnfoDTO.getIban())) {
            throw new AccountAlreadyExistsException();
        }

        switch (accountType) {
            case "ACCOUNT":
                if (usersDTO.size() != 1) {
                    throw new IncorrectAmountOfUsersException();
                }
                dao.addAccount(
                        composeToAccount(usersDTO, accnfoDTO, accountType));
                break;

            case "OVERDRAFT":
                if (usersDTO.size() != 1) {
                    throw new IncorrectAmountOfUsersException();
                }
                dao.addAccount(
                        composeToAccount(usersDTO, accnfoDTO, accountType));
                break;

            case "JOINT":
                if (usersDTO.size() != 2) {
                    throw new IncorrectAmountOfUsersException();
                }
                dao.addAccount(
                        composeToAccount(usersDTO, accnfoDTO, accountType));
                break;

            case "OVERDRAFT_JOINT":
                if (usersDTO.size() != 2) {
                    throw new IncorrectAmountOfUsersException();
                }
                dao.addAccount(
                        composeToAccount(usersDTO, accnfoDTO, accountType));
                break;

            default:
                throw new AccountTypeNotFoundException();
        }

        return true;
    }

    @Override
    public double deposit(String iban, double amount)
            throws AccountNotFoundException, NegativeAmountInsertedException {

        Optional<Double> newAmount = dao.deposit(iban, amount);

        if (newAmount.isEmpty())
            throw new AccountNotFoundException();

        if (newAmount.get() < 0)
            throw new NegativeAmountInsertedException();

        return newAmount.get();
    }

    @Override
    public double withdraw(String iban, double amount)
            throws AccountNotFoundException, NotEnoughBalanceException {

        Optional<Double> newAmount = dao.withdraw(iban, amount);

        if (newAmount.isEmpty()) {
            throw new AccountNotFoundException();
        }
        if (newAmount.get() < 0) {
            throw new NotEnoughBalanceException();
        }

        return newAmount.get();
    }

    @Override
    public String getInfo(String iban)
            throws AccountNotFoundException {

        Optional<String> nfo = dao.getInfo(iban);

        if (nfo.isEmpty()) {
            throw new AccountNotFoundException();
        }

        return nfo.get();
    }

    @Override
    public boolean deleteAccount(String iban) throws AccountNotFoundException {
        if (!dao.deleteAccount(iban))
            throw new AccountNotFoundException();
        return true;
    }

    // Helper Functions
    private Account composeToAccount(List<UserDTO> usersDTO, AccountInfoDTO accnfoDTO, String accountType) {

        switch (accountType) {
            case "ACCOUNT":
                return new Account(
                        convertUserDTO(usersDTO.get(0)),
                        convertAccnfoDTO(accnfoDTO));

            case "OVERDRAFT":
                return new OverdraftAccount(
                        convertUserDTO(usersDTO.get(0)),
                        convertAccnfoDTO(accnfoDTO));
            case "JOINT":
                return new JointAccount(
                        convertUserDTO(usersDTO.get(0)),
                        convertUserDTO(usersDTO.get(1)),
                        convertAccnfoDTO(accnfoDTO));
            case "OVERDRAFT_JOINT":
                return new OverdraftJointAccount(
                        convertUserDTO(usersDTO.get(0)),
                        convertUserDTO(usersDTO.get(1)),
                        convertAccnfoDTO(accnfoDTO));
            default:
                return new Account();
        }
    }

    private User convertUserDTO(UserDTO userDTO) {
        return new User(
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getSsn());
    }

    private AccountInfo convertAccnfoDTO(AccountInfoDTO accnfoDTO) {
        return new AccountInfo(
                accnfoDTO.getIban(),
                accnfoDTO.getBalance());
    }
}
