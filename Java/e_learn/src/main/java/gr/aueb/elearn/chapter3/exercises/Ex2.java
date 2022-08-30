package gr.aueb.elearn.chapter3.exercises;

import java.util.Scanner;

// Menu thingy, I don't know :-)
public class Ex2 {
    public static void main(String[] args) {
        String[] myMenu = {
            "Entry",
            "Deletion",
            "Update",
            "Search",
            "Exit"
        };
        
        int selection = -1;
        while (true) {
            displayMenu(myMenu);
            selection = getValidInt();
            if (selection == 5) break;
            if (selection < 1 || selection > 5) continue;
            System.out.printf("You selected %s",
                myMenu[selection - 1]);
        }
    }

    private static void displayMenu (String[] menu){
        for (int i = 1; i <= menu.length; i++) {
            System.out.printf("%d. %s\n",
                i, menu[i - 1]);
        }
    }

    private static int getValidInt(){
        Scanner inpt = new Scanner(System.in);
        
        while (true){
            try {
                return inpt.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Give me valid input.");
                inpt.nextLine();
            }
        }
    }
}
