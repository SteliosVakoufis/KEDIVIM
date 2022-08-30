package gr.aueb.elearn.chapter1.exercises;

// Prints my initials ("S"telios "V"akoufis)
public class Ex2 {
    public static void main(String[] args) {
        String[] myName = {
            " ****   **** ",
            "*       *   *",
            " ***    **** ",
            "    *   *   *",
            "****    **** ",
        };

        for (String str : myName) {
            System.out.println(str);
        }
    }
}
