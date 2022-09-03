package gr.aueb.elearn.chapter5;

import java.util.Scanner;

// einai or8ogonio??
public class RightTriangleDemo {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        // final double EPSILON = 0.005;
        // boolean isRight = false;
    
        System.out.println("Give me three digits...");
        a = getValidDouble();
        b = getValidDouble();
        c = getValidDouble();

        // test case = 5 - 3 - 4 input
        int is = Double.compare(Math.abs((a * a) - (b * b) - (c * c)), 0);

        System.out.println(is);
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
