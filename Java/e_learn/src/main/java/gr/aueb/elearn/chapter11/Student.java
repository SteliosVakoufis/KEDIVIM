package gr.aueb.elearn.chapter11;

import java.util.ArrayList;
import lombok.*;

// Java BEAN also a POJO
@Getter
@Setter
public class Student {

    private static int studentsCount = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        studentsCount++;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName + " Last Name: " + this.lastName + " ID: " + this.id;
    }

    public static void main(String[] args) {
        ArrayList<Student> myStudents = new ArrayList<>();

        myStudents.add(new Student(0, "Jesus", "Christ"));
        myStudents.add(new Student(1, "John", "Snow"));
        myStudents.add(new Student(2, "John", "Doe"));
        myStudents.add(new Student(3, "Jack", "Streets"));

        myStudents.forEach(st -> System.out.println(st.toString()));
        System.out.println(Student.studentsCount);
        System.out.println(myStudents.get(0).getFirstName());

    }
}
