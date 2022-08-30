package gr.aueb.elearn.chapter1.exercises;

import java.util.Scanner;

// A simple menu fucntion that accepts a string array as input and displays it.
public class Ex1 {
    public static void main(String[] args) {
        String[] choices = {
            "Entry",
            "Deletion",
            "Search",
            "Update",
            "Exit"
        };

        menu(choices);
    }

    private static void menu(String[] c){
        System.out.println("Select one of the following options:\n");
        for (int i = 0; i < c.length; i++){
            System.out.printf("%d. %s\n",
                i + 1, c[i]);
        }
        System.out.println("\nChoose a number: ");
        
        System.out.printf("You've chosen the operation -> %s.", 
            c[getValidInt(1, c.length)]);
    }

    private static int getValidInt(int low, int high){
        Scanner inpt = new Scanner(System.in);
        int choice = Integer.MIN_VALUE;
        
        do {
            try {
                choice = inpt.nextInt();
            } catch (Exception e) {
                inpt.next();
                choice = Integer.MIN_VALUE;
            }
            if (choice >= low && choice <= high) break;
            System.out.printf("Invalid input, number between %d and %d was requested.\n",
                low, high);
        } while (true);

        inpt.close();
        return choice - 1;
    }
}
