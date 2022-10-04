package gr.aueb.elearn.chapter17.accounts.dao;

import java.util.Optional;

import gr.aueb.elearn.chapter17.accounts.dao.interfaces.IOverdraftJointAccountDAO;
import gr.aueb.elearn.chapter17.accounts.model.OverdraftJointAccount;

public class OverdraftJointAccountDAOImpl extends AbstractDAO<OverdraftJointAccount> implements IOverdraftJointAccountDAO{

    @Override
    public Optional<Double> withdraw(long id, Double amount) {
        // TODO Auto-generated method stub
        return super.withdraw(id, amount);
    }
    
}
