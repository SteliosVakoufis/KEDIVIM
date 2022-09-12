package gr.aueb.elearn.miniprojects.project_02;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts;
    private int contactsNumber;

    public MobilePhone(int contactsNumber) {
        contacts = new ArrayList<>();
        this.contactsNumber = contactsNumber;
    }

    public void menu() {
        Scanner inpt = new Scanner(System.in);

        while (true) {
            try {
                this.printMainMenu();
                char operation = inpt.nextLine().charAt(0);
                if (operation == '5') {
                    break;
                }

                switch (operation) {
                    case '1':
                        System.out.println("PhoneNumber:");
                        System.out.println(this.searchContact(inpt.next()));
                        break;

                    case '2':
                        System.out.println("Name/LastName/PhoneNumber:");
                        this.insertContact(inpt.next(), inpt.next(), inpt.next());
                        break;

                    case '3':
                        System.out.println("OldPhoneNumber/NewName/NewLastName/NewPhoneNumber:");
                        this.updateContact(inpt.next(), inpt.next(), inpt.next(), inpt.next());
                        break;

                    case '4':
                        System.out.println("PhoneNumber:");
                        this.deleteContact(inpt.next());
                        break;

                    default:
                        inpt.nextLine();
                        System.out.println("Invalid operation.\n\n Try again:");
                        break;
                }

                inpt.nextLine();
            } catch (Exception e) {
                inpt.nextLine();
                System.err.println(e);
                System.out.println("\nError: Invalid input.\n");
            }
        }
        inpt.close();
    }

    private String searchContact(String phoneNumber) {
        if (!contactExists(phoneNumber))
            return "\nError: Contact doesn't exist!\n";

        String name = "", lastName = "";
        for (Contact cont : contacts) {
            if (cont.phoneNumber.equals(phoneNumber)) {
                name = cont.name;
                lastName = cont.lastName;
            }
        }

        return "Name: " + name + " Last name: " + lastName;
    }

    private void insertContact(String name, String lastName, String phoneNumber) {
        if (this.isFull()) {
            System.out.println("\nError: Contacts are full!\n");
            return;
        }
        if (this.contactExists(phoneNumber)) {
            System.out.println("\nError: Contact already exists\n");
            return;
        }
        this.contacts.add(new Contact(name, lastName, phoneNumber));
        this.contactsNumber--;
    }

    private void updateContact(String oldPhoneNumber, String newName, String newLastName, String newPhoneNumber) {
        if (!contactExists(oldPhoneNumber)){
            System.out.println("\nError: You are trying to update a non existant contact!\n");
            return;
        }

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).phoneNumber.equals(oldPhoneNumber)){
                contacts.get(i).name = newName;
                contacts.get(i).lastName = newLastName;
                contacts.get(i).phoneNumber = newPhoneNumber;
            }
        }

        System.out.println("\nContact has been succesfully updated!\n");
    }

    private void deleteContact(String phoneNumber) {
        if (!this.contactExists(phoneNumber)) {
            System.out.println("\nError: Contact doesn't exist\n");
            return;
        }

        for (int i = 0; i < this.contacts.size(); i++) {
            if (contacts.get(i).phoneNumber.equals(phoneNumber))
                contacts.remove(i);
        }
        this.contactsNumber++;

        System.out.println("\nDeletion was succesful!\n");
    }

    private void printMainMenu() {
        System.out.println("1. Search for a Contact");
        System.out.println("2. Insert a new Contact");
        System.out.println("3. Update a Contact");
        System.out.println("4. Delete a Contact");
        System.out.println("5. Exit");
        System.out.println();
    }

    private boolean contactExists(String phoneNumber) {
        for (Contact cont : contacts) {
            if (cont.phoneNumber.equals(phoneNumber))
                return true;
        }
        return false;
    }

    private void printContacts() {
        if (isEmpty())
            return;

        this.contacts.forEach(c -> System.out.printf("%s %s %s\n",
                c.name, c.lastName, c.phoneNumber));
    }

    private boolean isFull() {
        return contactsNumber == 0;
    }

    private boolean isEmpty() {
        return contacts.size() == 0;
    }
}
