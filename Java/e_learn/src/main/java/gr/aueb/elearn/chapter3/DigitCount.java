package gr.aueb.elearn.chapter3;
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        // int num = 0;
        int count = 0;
        int result = 0;

        System.out.println("Dose ena akeraio: ");
        result = inpt.nextInt();

        do {
            result = result / 10;
            count++;
        } while (result != 0);

        inpt.close();
        System.out.printf("To plithos twn psifiwn einai: " + count);
    }
}
