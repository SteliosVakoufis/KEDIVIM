package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class DoubleFloatPrintF {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        double d = 0.0d;
        float f = 0.0f;
        double result = 0.0d;

        System.out.println("Give me two numbers.");
        d = getValidFloat();
        f = getValidFloat();
        
        result = d / f;

        System.out.printf("Result: %.4f",
            result
        );

        inpt.close();
    }

    private static Float getValidFloat(){
        Scanner inpt = new Scanner(System.in);
        
        while (true){
            try {
                return inpt.nextFloat();
            } catch (Exception e) {
                System.out.println(e);
                inpt.nextLine();
            }
        }
    }
}
