package gr.aueb.elearn.chapter2.exercises;

import java.util.Scanner;

// This program accepts user input and displays it in a date format
public class Ex2 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int[] userDate = new int[3];

        for (int i = 0; i < userDate.length; i++){
            userDate[i] = inpt.nextInt();
        }

        System.out.printf("%02d/%02d/%04d",
            userDate[0], userDate[1], userDate[2]);

        inpt.close();
    }
}
