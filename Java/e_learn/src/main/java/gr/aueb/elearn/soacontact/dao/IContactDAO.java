package gr.aueb.elearn.soacontact.dao;

import java.util.List;
import java.util.Optional;

import gr.aueb.elearn.miniprojects.project_02.Contact;

public interface IContactDAO {
    boolean insert(Contact contact);

    Optional<Contact> update(Contact contact);

    Optional<Contact> delete(long id);

    List<Contact> getAll();

    Optional<Contact> getOne(long id);
}
