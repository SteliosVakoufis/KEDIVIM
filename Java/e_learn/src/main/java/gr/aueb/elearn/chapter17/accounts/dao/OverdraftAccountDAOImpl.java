package gr.aueb.elearn.chapter17.accounts.dao;

import java.util.Optional;

import gr.aueb.elearn.chapter17.accounts.dao.interfaces.IOverdraftAccountDAO;
import gr.aueb.elearn.chapter17.accounts.model.OverdraftAccount;

public class OverdraftAccountDAOImpl extends AbstractDAO<OverdraftAccount> implements IOverdraftAccountDAO {

    @Override
    public Optional<Double> withdraw(long id, Double amount) {
        // TODO Auto-generated method stub
        return super.withdraw(id, amount);
    }

}
