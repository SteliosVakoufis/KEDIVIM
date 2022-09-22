package account.dao;

import java.util.ArrayList;
import java.util.Optional;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountsControllerDAO implements IAccountsControllerDAO {
    ArrayList<Account> accounts = new ArrayList<>();

    @Override
    public boolean addAccount(Account account) {
        if (ibanExists(account.getAccnfo().getIban()))
            return false;

        accounts.add(account);
        return true;
    }

    @Override
    public Optional<Double> deposit(String iban, double amount) {
        int index = getIbanPos(iban);
        if (index == -1)
            return Optional.empty();

        return accounts.get(index).deposit(amount);
    }

    @Override
    public Optional<Double> withdraw(String iban, double amount) {
        int index = getIbanPos(iban);
        if (index == -1)
            return Optional.empty();

        return accounts.get(index).withdraw(amount);
    }

    @Override
    public Optional<String> getInfo(String iban) {
        int index = getIbanPos(iban);
        if (index == -1)
            return Optional.empty();

        return Optional.of(accounts.get(index).toString());
    }

    public boolean ibanExists(String iban) {
        for (Account account : this.accounts) {
            if (account.isValidIban(iban))
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteAccount(String iban) {
        int index = getIbanPos(iban);
        if (index == -1)
            return false;
        accounts.remove(index);
        return true;
    }

    // Helper functions

    private int getIbanPos(String iban) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).isValidIban(iban))
                return i;
        }
        return -1;
    }
}
