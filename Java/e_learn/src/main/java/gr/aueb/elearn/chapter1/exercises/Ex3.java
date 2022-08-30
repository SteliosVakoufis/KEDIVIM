package gr.aueb.elearn.chapter1.exercises;

import java.util.Scanner;

// A program that accepts two inputs from the user and prints the sum of them.
public class Ex3 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        int sum = 0;

        Scanner inpt = new Scanner(System.in);

        while(true){
            try {
                num1 = inpt.nextInt();
                num2 = inpt.nextInt();
            } catch (Exception e) {
                inpt.next();
                num1 = 0;
                num2 = 0;
                System.out.println(e);
                continue;
            }
            break;
        }
        sum = num1 + num2;
        System.out.printf("The result is %d.", sum);
    }
}
