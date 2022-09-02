package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        
        System.out.printf("Your two ints are: %d, %d",
            getValidInt(), getValidInt()
        );

    }

    private static int getValidInt(){
        Scanner inpt = new Scanner(System.in);
        
        while (true){
            try {
                return inpt.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                inpt.nextLine();
            }
        }
    }

}
