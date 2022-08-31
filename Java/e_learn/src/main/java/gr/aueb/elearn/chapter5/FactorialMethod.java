package gr.aueb.elearn.chapter5;

import java.util.Scanner;

// FactorialMethod
public class FactorialMethod {
    public static void main(String[] args) {
        int userInput = getValidInt();
        System.out.printf("The factorial of %d is %d",
            userInput, getFactorial(userInput)
        );
    }

    private static int getFactorial (int n){
        return n == 1 ? n : getFactorial(n - 1) * n;
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
