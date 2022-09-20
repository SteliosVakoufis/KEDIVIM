package gr.aueb.elearn.chapter15.soacontact;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import gr.aueb.elearn.chapter15.soacontact.dao.ContactDaoImpl;
import gr.aueb.elearn.chapter15.soacontact.dao.IContactDAO;
import gr.aueb.elearn.chapter15.soacontact.dto.ContactDTO;
import gr.aueb.elearn.chapter15.soacontact.model.Contact;
import gr.aueb.elearn.chapter15.soacontact.service.ContactServiceImpl;
import gr.aueb.elearn.chapter15.soacontact.service.IContactService;
import gr.aueb.elearn.chapter15.soacontact.service.exception.ContactAlreadyExistsException;
import gr.aueb.elearn.chapter15.soacontact.service.exception.ContactNotExistsException;

// Controller and View like
public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final IContactDAO contactDAO = new ContactDaoImpl();
    private static final IContactService service = new ContactServiceImpl(contactDAO);

    public static void main(String[] args) {
        int choice = 0;
        ContactDTO contactDTO;

        do {
            choice = getChoice();
            printMenu();

            switch (choice) {
                case 1:
                    try {
                        contactDTO = new ContactDTO(getId(), getFirstName(), getLastname());
                        service.insertContact(contactDTO);
                    } catch (ContactAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        long id = getId();
                        service.deleteContact(id);
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        contactDTO = new ContactDTO(getId(), getFirstName(), getLastname());
                        Optional<Contact> optionalContact = service.updateContact(contactDTO);
                        optionalContact.ifPresent(c -> System.out.println("Old contact + " + c + " was updated!"));
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        long id = getId();
                        Optional<Contact> contact = service.getOneContact(id);
                        contact.ifPresent(System.out::println);
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    List<Contact> contacts = service.getAllContacts();
                    contacts.forEach(a -> System.out.printf("%d", a));
                    System.out.println();
                    break;

                case 6:
                    System.out.println("You have selected exit!");
                    break;

                default:
                    System.out.println("Select 1-6");
                    break;
            }

        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Select one of the following");
        System.out.println("1. Insert Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Update Contact");
        System.out.println("4. Search Contact");
        System.out.println("5. Print All Contacts");
        System.out.println("6. Exit");
    }

    public static String getFirstName() {
        System.out.println("Insert name");
        return in.next();
    }

    public static String getLastname() {
        System.out.println("Insert last name");
        return in.next();
    }

    public static int getId() {
        System.out.println("Insert id");
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    public static int getChoice() {
        String s = in.next();
        if (isInt(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
