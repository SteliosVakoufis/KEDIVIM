package gr.aueb.elearn.chapter5;

import java.util.Scanner;

// pow pow pow
public class PowerMethod {
    public static void main(String[] args) {
        System.out.printf("With the input you have given,\nthis is the result: %.1f",
            Math.pow(getValidDouble(), getValidDouble())
        );
    }

    private static Double getValidDouble(){
        Scanner inpt = new Scanner(System.in);
        
        while (true){
            try {
                return inpt.nextDouble();
            } catch (Exception e) {
                System.out.println(e);
                inpt.nextLine();
            }
        }
    }
}
