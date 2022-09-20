package gr.aueb.elearn.miniprojects.project_02;

public class Contact {
    public String name;
    public String lastName;
    public String phoneNumber;

    public Contact(String name, String lastName, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                " Last name: " + this.lastName +
                " Phone Number: " + this.phoneNumber;
    }
}
