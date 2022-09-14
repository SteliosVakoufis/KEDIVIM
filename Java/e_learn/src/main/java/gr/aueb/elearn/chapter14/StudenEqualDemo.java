package gr.aueb.elearn.chapter14;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;

public class StudenEqualDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>() {
            {
                add(new Student(1, "Alice", "Nonderland"));
                add(new Student(2, "Duck", "Nonderland"));
                add(new Student(3, "Cat", "Nonderland"));
                add(new Student(4, "Hello", "Nonderland"));
            }
        };

        // printStudent(students, new IDEqualChecker() {
        //     @Override
        //     public boolean checkEqualId(Student student) {
        //         return student.getId() == 1 || student.getId() == 2;
        //     }
        // });

        printStudent(students, (student -> student.getId() == 2));

    }

    public static void printStudent(ArrayList<Student> students, IDEqualChecker idChecker) {
        for (Student student : students) {
            if (idChecker.checkEqualId(student))
                System.out.println(student);
        }
    }
}
