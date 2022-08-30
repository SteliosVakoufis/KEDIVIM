package gr.aueb.elearn.chapter3;
import java.util.Scanner;

public class AbsDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int myNumber = 0;

        System.out.println("Insert a number!");
        myNumber = inpt.nextInt();

        System.out.printf("Absolute of %d is %d",
            myNumber, Math.abs(myNumber));
    }
}
