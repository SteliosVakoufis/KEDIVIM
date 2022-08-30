package gr.aueb.elearn.chapter3;

import java.util.Scanner;

// It's a boolean demo, what did you expect?
public class BooleanDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        boolean isRaining = false, isSnowing = false;
        int temperature = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = inpt.nextBoolean();
        System.out.println("Please insert temperature");
        temperature = inpt.nextInt();

        isSnowing = isRaining && (temperature < 0);
        System.out.printf("IsSnowing: %s", (isSnowing) ? "YES" : "NO");
        
        inpt.close();
    }
}
