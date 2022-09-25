package account.dao;

import java.util.ArrayList;
import java.util.Optional;

public interface IAccountsControllerDAO {
    ArrayList<IAccount> accounts = new ArrayList<>();

    boolean addAccount(Account account);

    Optional<Double> withdraw(String iban, double amount);

    Optional<Double> deposit(String iban, double amount);

    Optional<String> getInfo(String iban);

    boolean deleteAccount(String iban); 

    boolean ibanExists(String iban);

}
