package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class MethodMenu {
    public static void main(String[] args) {
        displayMenu();
        int choice = 0;

        do {
            displayMenu();
            choice = getValidInt();
        } while (choice != 5);
    }

    private static void displayMenu(){
        System.out.println("Select:");
        System.out.println("1 .Hello");
        System.out.println("2. sup");
        System.out.println("3. 3");
        System.out.println("4. 5");
        System.out.println("5. exit");
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
