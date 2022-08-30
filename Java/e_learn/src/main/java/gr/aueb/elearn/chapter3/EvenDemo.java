package gr.aueb.elearn.chapter3;

import java.util.Scanner;

public class EvenDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;
        
        System.out.println("Please insert a num");
        num = inpt.nextInt();

        isEven = (num % 2 == 0);

        System.out.printf("%s even!",
            isEven ? "Is" : "Not");
        
        inpt.close();
    }
}
