package gr.aueb.elearn.soacontact.service;

import gr.aueb.elearn.soacontact.model.*;

import java.util.List;
import java.util.Optional;

import gr.aueb.elearn.soacontact.dto.*;
import gr.aueb.elearn.soacontact.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.soacontact.service.exception.ContactNotExistsException;

public interface IContactService {
    boolean insertContact(ContactDTO contactDTO) throws ContactAlreadyExistsException;

    Optional<Contact> updateContact(ContactDTO contactDTO) throws ContactNotExistsException;

    void deleteContact(long id) throws ContactNotExistsException;

    List<Contact> getAllContacts();

    Optional<Contact> getOneContact(long id) throws ContactNotExistsException;
}
