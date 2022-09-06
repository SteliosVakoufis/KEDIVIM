package gr.aueb.elearn.miniprojects.project_02;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;
    private int contactsNumber;

    public MobilePhone(int contactsNumber) {
        contacts = new ArrayList<>();
        this.contactsNumber = contactsNumber;
    }

    public void printContacts() {
        if (isEmpty())
            return;

        this.contacts.forEach(c -> System.out.printf("%s %s %s\n",
                c.name, c.lastName, c.phoneNumber));
    }

    public boolean contactExists(Contact item) {
        for (Contact contact : this.contacts) {
            if (sameContacts(contact, item))
                return true;
        }
        return false;
    }

    public void insertNewContact(Contact contact) {
        if (isFull()) {
            System.out.println("Your contacts are full!");
            return;
        }
        if (contactExists(contact)) {
            System.out.println("Contact already in your phone.");
            return;
        }

        contacts.add(contact);
        this.contactsNumber++;

    }

    public void updateContact(Contact item, Contact replace) {
        if (!contactExists(item)) {
            System.out.println("Contact doesn't exist.");
            return;
        }
        if (contactExists(replace)) {
            System.out.println("Contact already exists.");
            return;
        }

        removeContact(item);
        insertNewContact(replace);
    }

    public Contact removeContact(Contact item) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if (sameContacts(this.contacts.get(i), item)) {
                contactsNumber--;
                return this.contacts.remove(i);
            }
        }
        return null;
    }

    private boolean isFull() {
        return contactsNumber == 0;
    }

    private boolean isEmpty() {
        return contactsNumber == 0;
    }

    private boolean sameContacts(Contact contactA, Contact contactB) {
        return contactA.name == contactB.name &&
                contactA.lastName == contactB.lastName &&
                contactA.phoneNumber == contactB.phoneNumber;
    }

}
