package gr.aueb.elearn.chapter15.soacontact.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import gr.aueb.elearn.chapter15.soacontact.dao.IContactDAO;
import gr.aueb.elearn.chapter15.soacontact.dto.ContactDTO;
import gr.aueb.elearn.chapter15.soacontact.model.Contact;
import gr.aueb.elearn.chapter15.soacontact.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter15.soacontact.service.exception.ContactNotExistsException;

public class ContactServiceImpl implements IContactService {
    private final IContactDAO dao;

    // Dependency Injection
    public ContactServiceImpl(IContactDAO contactDAO) {
        dao = contactDAO;
    }

    @Override
    public void deleteContact(long id) throws ContactNotExistsException {
        try {
            if (!dao.delete(id)) {
                throw new ContactNotExistsException(id);
            }
        } catch (ContactNotExistsException e) {
            System.err.println("Contact doesn't exist " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public List<Contact> getAllContacts() {
        return dao.getAll();
    }

    @Override
    public Optional<Contact> getOneContact(long id) throws ContactNotExistsException {
        try {
            Optional<Contact> contact = dao.getOne(id);
            if (contact.isPresent()) {
                return contact;
            } else {
                throw new ContactNotExistsException(id);
            }
        } catch (ContactNotExistsException e) {
            System.err.println("Contact doesn't exist " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public boolean insertContact(ContactDTO contactDTO) throws ContactAlreadyExistsException {
        try {
            Contact contact = this.convertDTO(contactDTO);

            if (dao.insert(contact)) {
                return true;
            } else {
                throw new ContactAlreadyExistsException(contact);
            }
        } catch (ContactAlreadyExistsException e) {
            System.err.println("Contact already exists exception " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public Optional<Contact> updateContact(ContactDTO contactDTO) throws ContactNotExistsException {
        try {
            Contact contact = this.convertDTO(contactDTO);
            Optional<Contact> optionalContact = dao.update(contact);

            if (optionalContact.isEmpty()) {
                throw new ContactNotExistsException(contact);
            } else {
                return optionalContact;
            }
        } catch (ContactNotExistsException e) {
            System.err.println("Contact doesn't exist exception " + LocalDateTime.now());
            throw e;
        }
    }

    private Contact convertDTO(ContactDTO contactDTO) {
        return new Contact(contactDTO.getId(), contactDTO.getFirstName(), contactDTO.getLastName());
    }
}
