package gr.aueb.elearn.chapter4.exercises;

// Same as Ex3.java
public class Ex4 {
    public static void main(String[] args) {
        
        String fill = "*";

        for (int i = 0; i < 10; i++) {
            System.out.println(fill.repeat(i + 1));
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(fill.repeat(i));
        }

    }
}
