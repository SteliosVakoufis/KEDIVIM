package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        System.out.printf("%d",
            getValidInt()
        );
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
