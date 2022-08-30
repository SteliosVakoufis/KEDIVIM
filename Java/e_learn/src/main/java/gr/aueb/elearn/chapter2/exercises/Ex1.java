package gr.aueb.elearn.chapter2.exercises;

import java.util.Scanner;

// This program converts Fahrenheit degrees into Celcius degrees via user input.
public class Ex1 {
    public static void main(String[] args) {
        int degreesToConvert = 0;
        int converted = 0;

        System.out.println("Welcome to this great Fahrenheit to Celcius convertion app!");
        System.out.println("Give me an integer value that will represent degrees in Fahrenheit");

        degreesToConvert = getValidInteger();
        converted = fahrenheitToCelcius(degreesToConvert);

        System.out.printf("%d%sF are %d%sC!\n",
            degreesToConvert, "\u00b0", converted, "\u00b0");
    }

    private static int fahrenheitToCelcius(int fahrenheit){
        final float SUB = 32;
        final float MULT = 0.5556F;

        return Math.round((fahrenheit - SUB) * MULT);
    }

    private static int getValidInteger(){
        Scanner inpt = new Scanner(System.in);
        int a;

        while(true){
            try {
                a = inpt.nextInt();
                break;
            } catch (Exception e) {
                inpt.nextLine();
                System.out.println(e);
            }
        }

        inpt.close();
        return a;
    }
}
