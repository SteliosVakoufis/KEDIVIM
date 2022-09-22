package account.dao;

import java.util.Optional;

import account.model.AccountInfo;
import account.model.User;

interface IAccount {
    AccountInfo accnfo = new AccountInfo();
    User user = new User();

    Optional<Double> deposit(double amount);

    Optional<Double> withdraw(double amount);

    boolean isSsnValid(String ssn);

    boolean isValidIban(String iban);

    Optional<Double> getAccountBalance();

    String toString();

}
