package gr.aueb.elearn.chapter8;

import java.util.Scanner;

public class DataValidationDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        String strNum = "";
        int num = 0;

        while (true) {
            System.out.printf("Insert an int\n");
            strNum = inpt.next();

            if (isInt(strNum))
                num = Integer.parseInt(strNum);
            else{
                System.out.println("Not an Integer.");
                continue;
            }

            System.out.println("You inserted " + num);
        }
    }

    private static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }


}
