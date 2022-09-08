package gr.aueb.elearn.miniprojects.project_02;

// Forgot to make a menu :-)
public class app {
    public static void main(String[] args) {
        MobilePhone myMobilePhone = new MobilePhone(500);

        myMobilePhone.insertNewContact(new Contact(
                "John", "Doe", "999999999"));
        myMobilePhone.insertNewContact(new Contact(
                "Jack", "Eod", "144422332"));
        myMobilePhone.insertNewContact(new Contact(
                "Jofrey", "Johnes", "44324677"));
        myMobilePhone.insertNewContact(new Contact(
                "John", "Doe", "999999999"));

        myMobilePhone.printContacts();

        System.out.println(myMobilePhone.contactExists(new Contact(
                "John", "Doe", "999999999")));
        System.out.println(myMobilePhone.contactExists(new Contact(
                "John", "Doe", "4222344")));

        myMobilePhone.updateContact(
                new Contact("John", "Doe", "999999999"),
                new Contact("Jacky", "Doe", "999999999"));

        System.out.println("Removed: " + myMobilePhone.removeContact(
                new Contact("Jacky", "Doe", "999999999")));
    }
}
