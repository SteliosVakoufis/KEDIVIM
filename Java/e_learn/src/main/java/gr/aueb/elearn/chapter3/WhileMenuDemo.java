package gr.aueb.elearn.chapter3;

import java.util.Scanner;

// While
public class WhileMenuDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int current = Integer.MIN_VALUE;
        
        while (true) {
            try {
                current = inpt.nextInt();
            } catch (Exception e) {
                inpt.next();
                System.out.println(e);
                continue;
            }
            if (current == 0) break;
            menu(current);
        }
        
        inpt.close();
    }

    private static void menu(int c){
        switch (c) {
            case 1:
                System.out.println("Mu edoses 1!");
                break;
            case 2:
                System.out.println("Mu edoses 2!");
                break;
            case 3:
                System.out.println("Mu edoses 3!");
                break;
        }
    }
}
