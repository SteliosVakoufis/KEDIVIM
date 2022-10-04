package gr.aueb.elearn.chapter17.accounts.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import gr.aueb.elearn.chapter17.accounts.dao.interfaces.ISingleAccountMethodsDAO;
import gr.aueb.elearn.chapter17.accounts.dao.interfaces.IGenericDAO;

public abstract class AbstractDAO<T> implements IGenericDAO<T>, ISingleAccountMethodsDAO<T> {
    protected Map<Long, T> entities = new HashMap<>();

    @Override
    public Optional<Double> deposit(long id, Double amount) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Double> withdraw(long id, Double amount) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        entities.remove(id);
    }

    @Override
    public T get(Long id) {
        if (entities.containsKey(id))
            return null;
        return entities.get(id);
    }

    @Override
    public Map<Long, T> getAll() {
        if (entities.size() == 0)
            return null;
        return new HashMap<>(entities);
    }

    @Override
    public T insert(Long id, T t) {
        if (entities.containsKey(id))
            return null;
        entities.put(id, t);
        return t;
    }

    @Override
    public void replace(Long id, T t) {
        entities.replace(id, t);
    }
}
