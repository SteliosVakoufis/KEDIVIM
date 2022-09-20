package gr.aueb.elearn.chapter15.soacontact.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import gr.aueb.elearn.chapter15.soacontact.model.Contact;

public class ContactDaoImpl implements IContactDAO {
    private static final List<Contact> contacts;

    static {
        contacts = new ArrayList<>();
    }

    @Override
    public boolean delete(long id) {
        int positionToDelete = getPosition(id);

        if (positionToDelete != -1) {
            this.contacts.remove(positionToDelete);
            return true;
        }

        return false;
    }

    @Override
    public List<Contact> getAll() {
        return new ArrayList<>(contacts);
    }

    @Override
    public Optional<Contact> getOne(long id) {
        int result = getPosition(id);
        return result != -1 ? Optional.of(this.contacts.get(result)) : Optional.empty();
    }

    @Override
    public boolean insert(Contact contact) {
        if (contact == null || contacts.contains(contact)) {
            return false;
        }

        this.contacts.add(contact);
        return true;
    }

    @Override
    public Optional<Contact> update(Contact contact) {
        if (contact == null)
            return Optional.empty();
        int positionToUpdate = getPosition(contact.getId());
        if (positionToUpdate != -1) {
            Contact c = this.contacts.get(positionToUpdate);
            this.contacts.add(positionToUpdate, contact);
            return Optional.of(c);
        }
        return Optional.empty();
    }

    private int getPosition(long id) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id)
                return i;
        }
        return -1;
    }
}
