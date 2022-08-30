package gr.aueb.elearn.chapter2;
import java.util.Scanner;

// diavazi
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        int num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE;
        int sum = 0;

        while (num1 == Integer.MIN_VALUE ||
                num2 == Integer.MIN_VALUE){
            try {
                num1 = inpt.nextInt();
                inpt.next();
                num2 = inpt.nextInt();
            } catch (Exception e){
                System.out.println(e);
                inpt.next();
            }
        }

        sum = num1 + num2;
        System.out.printf("The sum of %d and %d is %d"
                ,num1, num2, sum);

        inpt.close();
    }
}
