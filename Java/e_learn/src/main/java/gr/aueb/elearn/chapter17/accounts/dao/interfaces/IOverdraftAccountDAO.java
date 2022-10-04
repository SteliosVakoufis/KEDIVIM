package gr.aueb.elearn.chapter17.accounts.dao.interfaces;

import java.util.Optional;

import gr.aueb.elearn.chapter17.accounts.model.OverdraftAccount;

public interface IOverdraftAccountDAO extends IGenericDAO<OverdraftAccount>, ISingleAccountMethodsDAO<OverdraftAccount> {
    Optional<Double> withdraw(long id, Double amount);

}
