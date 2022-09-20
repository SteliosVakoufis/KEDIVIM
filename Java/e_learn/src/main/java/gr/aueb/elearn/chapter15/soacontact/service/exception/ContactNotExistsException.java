package gr.aueb.elearn.chapter15.soacontact.service.exception;

import gr.aueb.elearn.chapter15.soacontact.model.Contact;

public class ContactNotExistsException extends Exception {
    public ContactNotExistsException(Contact contact) {
        super("Contact with id = " + contact.getId() + " doesn't exist!");
    }

    public ContactNotExistsException(long id) {
        super("Contact with id = " + id + " doesn't exist!");
    }

}
