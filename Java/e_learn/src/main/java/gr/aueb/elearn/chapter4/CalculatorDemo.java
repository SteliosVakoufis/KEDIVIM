package gr.aueb.elearn.chapter4;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) throws IOException{
        Scanner inpt = new Scanner(System.in);
        int a = 0, b = 0;
        char selection = ' ';

        a = inpt.nextInt();
        selection = (char) System.in.read();
        b = inpt.nextInt();

        switch(selection){
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(b != 0 ? a / b : "Feeling a bit adventurous?");
                break;

            case '%':
                System.out.println(b != 0 ? a % b : "Feeling a bit adventurous?");
            break;

            default:
                break;
        }

        inpt.close();
    }
}
