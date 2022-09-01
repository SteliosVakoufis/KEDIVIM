package gr.aueb.elearn.chapter5;

import java.util.Scanner;

// factorial...
public class FactorialRecursive {
    
    public static void main(String[] args) {
        System.out.printf("Factorial... %d",
            getFactorial(getValidInt())
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
