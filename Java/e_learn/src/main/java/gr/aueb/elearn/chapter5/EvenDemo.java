package gr.aueb.elearn.chapter5;

import java.util.Scanner;

public class EvenDemo {
    public static void main(String[] args) {
        double userinptA = getValidDouble();

        System.out.printf("isEven: %b",
            isEven(userinptA)
        );

    }

    private static boolean isEven(double a){
        return a % 2 == 0;
    }

    private static boolean isOdd(double a){
        return !(a % 2 == 0);
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
