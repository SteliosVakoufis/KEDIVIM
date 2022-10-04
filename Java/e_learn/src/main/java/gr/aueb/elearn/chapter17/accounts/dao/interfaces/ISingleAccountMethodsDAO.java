package gr.aueb.elearn.chapter17.accounts.dao.interfaces;

import java.util.Optional;

public interface ISingleAccountMethodsDAO<T> {
    Optional<Double> withdraw(long id, Double amount);

    Optional<Double> deposit(long id, Double amount);
}
