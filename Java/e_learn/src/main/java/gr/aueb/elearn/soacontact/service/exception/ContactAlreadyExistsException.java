package gr.aueb.elearn.soacontact.service.exception;

import gr.aueb.elearn.soacontact.model.Contact;

public class ContactAlreadyExistsException extends Exception{
    public ContactAlreadyExistsException(Contact contact) {
        super("Contact with id = " + contact.getId() + " already exists!");
    }
    
}
