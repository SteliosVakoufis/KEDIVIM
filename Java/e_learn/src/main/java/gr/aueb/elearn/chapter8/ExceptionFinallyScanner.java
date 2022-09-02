package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class ExceptionFinallyScanner {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        
        try {
            int i = inpt.nextInt();
            System.out.println("Your input was ");
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        } finally {
            try {
                inpt.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}
