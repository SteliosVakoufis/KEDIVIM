package gr.aueb.elearn.chapter15.soacontact.service.exception;

import gr.aueb.elearn.chapter15.soacontact.model.Contact;

public class ContactAlreadyExistsException extends Exception{
    public ContactAlreadyExistsException(Contact contact) {
        super("Contact with id = " + contact.getId() + " already exists!");
    }
    
}
