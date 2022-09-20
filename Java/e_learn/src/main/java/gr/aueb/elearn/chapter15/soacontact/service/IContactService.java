package gr.aueb.elearn.chapter15.soacontact.service;

import java.util.List;
import java.util.Optional;

import gr.aueb.elearn.chapter15.soacontact.dto.*;
import gr.aueb.elearn.chapter15.soacontact.model.*;
import gr.aueb.elearn.chapter15.soacontact.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter15.soacontact.service.exception.ContactNotExistsException;

public interface IContactService {
    boolean insertContact(ContactDTO contactDTO) throws ContactAlreadyExistsException;

    Optional<Contact> updateContact(ContactDTO contactDTO) throws ContactNotExistsException;

    void deleteContact(long id) throws ContactNotExistsException;

    List<Contact> getAllContacts();

    Optional<Contact> getOneContact(long id) throws ContactNotExistsException;
}
