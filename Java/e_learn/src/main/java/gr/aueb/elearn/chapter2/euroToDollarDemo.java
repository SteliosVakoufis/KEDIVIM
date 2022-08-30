package gr.aueb.elearn.chapter2;

import java.util.Scanner;

/*Exchanges euro to dollars via
 * a currency rate.
 */
public class euroToDollarDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        final int CURRENCY_RATE = 116;
        int eurosToConvert = 0;
        int eurosToDollars = 0;

        System.out.println("How many euros would you like to convert?");
        eurosToConvert = inpt.nextInt();

        eurosToDollars = eurosToConvert * CURRENCY_RATE;
        System.out.printf("%d Euros = %d Dollars, %d, Cents\n",
            eurosToConvert, eurosToDollars / 100, eurosToDollars % 100);

        inpt.close();
    }
}
