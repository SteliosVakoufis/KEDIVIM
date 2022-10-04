package gr.aueb.elearn.chapter17.accounts.dao.interfaces;

import java.util.Optional;

import gr.aueb.elearn.chapter17.accounts.model.OverdraftJointAccount;

public interface IOverdraftJointAccountDAO extends IGenericDAO<OverdraftJointAccount>, ISingleAccountMethodsDAO<OverdraftJointAccount> {
    Optional<Double> withdraw(long id, Double amount);
    
}
