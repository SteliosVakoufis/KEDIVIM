package gr.aueb.elearn.chapter15.soacontact.dao;

import java.util.List;
import java.util.Optional;

import gr.aueb.elearn.chapter15.soacontact.model.Contact;

public interface IContactDAO {
    boolean insert(Contact contact);

    Optional<Contact> update(Contact contact);

    boolean delete(long id);

    List<gr.aueb.elearn.chapter15.soacontact.model.Contact> getAll();

    Optional<Contact> getOne(long id);
}
