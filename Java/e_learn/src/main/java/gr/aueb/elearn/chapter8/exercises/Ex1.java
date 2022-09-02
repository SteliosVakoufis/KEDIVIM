package gr.aueb.elearn.chapter8.exercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Menu with exceptions..
public class Ex1 {
    public static void main(String[] args) {
        // Init menu items.
        String[] myMenu = {
            "1. Print n amount of asterisks(*) horizontally!",
            "2. Print n amount of asterisks(*) vertically!",
            "3. Print n lines of n asterisks(*)!",
            "4. Print n lines of asterisks(*) with 1 - n?",
            "5. Print n lines of asterisks(*) with n - 1?",
            "6. Exit the program! 👍"
        };

        // Main program loop
        while (true){
            displayMenu(myMenu);
            int user_selection;

            try {
                user_selection = getInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Invalid input.");
                continue;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Invalid input.");
                continue;
            }

            if (user_selection == 6) break;
            if (user_selection > 0 && user_selection < myMenu.length){
                System.out.printf("You have selected: %s\nGive me a number.\n",
                    myMenu[user_selection - 1]
                );

                do {
                    try {
                        doYourThing(user_selection, getInt());
                        break;
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                        System.out.println("Invalid input.");
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Invalid input.");
                    }
                } while (true);
            }
        }

    }

    // Menu display function
    private static void displayMenu(String[] menu){
        Arrays.stream(menu).forEach(System.out::println);
    }

    // Accepts an integer input from the user or else it throws an exception.
    private static int getInt() throws InputMismatchException, Exception{
        Scanner inpt = new Scanner(System.in);

        try {
            return inpt.nextInt();
        } catch (InputMismatchException e) {
            throw e;
        } catch (Exception e){
            throw e;
        }
    }

    private static void doYourThing(int user_selection, int amount){
        System.out.println("\n---P-R-I-N-T-I-G---A-R-E-A---\n");
        switch (user_selection) {
            case 1:
                for (int i = 0; i <= amount; i++) System.out.printf("%c", i != amount - 1 ? '*' : '\n');
                break;
        
            case 2:
                for (int i = 0; i <= amount; i++) System.out.printf("%c\n", i != amount - 1 ? '*' : ' ');
                break;
        
            case 3:
                for (int i = 0; i <= amount; i++){
                    for (int j = 0; j <= amount; j++) {
                        System.out.printf("%c", '*');
                    }
                    System.out.println();
                }
                break;
        
            case 4:
                for (int i = 0; i <= amount; i++){
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%c", '*');
                    }
                    System.out.println();
                }
                break;
        
            case 5:
                for (int i = 0; i <= amount; i++){
                    for (int j = i; j <= amount; j++) {
                        System.out.printf("%c", '*');
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Hey, how is it going?");
                break;
        }
        System.out.println("\n---P-R-I-N-T-I-G---A-R-E-A---\n");
    }
}
