package gr.aueb.elearn.soacontact.service.exception;

import gr.aueb.elearn.soacontact.model.Contact;

public class ContactNotExistsException extends Exception {
    public ContactNotExistsException(Contact contact) {
        super("Contact with id = " + contact.getId() + " doesn't exist!");
    }

    public ContactNotExistsException(long id) {
        super("Contact with id = " + id + " doesn't exist!");
    }

}
