package gr.aueb.elearn.chapter5;

import java.util.Arrays;
import java.util.Scanner;

// A calculator of sorts :-)
public class MethodCalculator {
    public static void main(String[] args) {
        String[] myMenu = {
            "--!calculator!--",
            "1. Addition",
            "2. Subtract",
            "3. Division",
            "4. Modulo",
            "5. Multiply",
            "6. Exit the program."
        };


        int userInput = 0;
        do {
            displayMenu(myMenu);
            userInput = getValidInt();
            if (userInput > 0 && userInput <= 5) {
                System.out.printf("\nYou have selected %s\n", myMenu[userInput]);
                int a = getValidInt(), b = getValidInt();
                System.out.printf("\nYour result is: %d\n\n",
                    userInput == 1 ? a + b : 
                    userInput == 2 ? a - b :
                    userInput == 3 ? b == 0 ? 0 : a / b :
                    userInput == 4 ? b == 0 ? 0 : a % b :
                    userInput == 5 ? a * b : 0
                );
            }
        } while (userInput != 6);

    }

    private static void displayMenu(String[] menu){
        Arrays.stream(menu).forEach(row -> System.out.println(row));
        // for (String row : menu) {
        //     System.out.println(row);
        // }
    }

    private static int getValidInt(){
        Scanner inpt = new Scanner(System.in);
        
        while (true){
            try {
                return inpt.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                inpt.nextLine();
            }
        }
    }

}
