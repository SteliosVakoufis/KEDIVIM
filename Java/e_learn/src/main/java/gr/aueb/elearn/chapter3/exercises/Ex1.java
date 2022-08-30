package gr.aueb.elearn.chapter3.exercises;

import java.util.Scanner;

// Check to see if a year is a leap year! :-)
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Give me a year to see if it is a leap year! :-)");
        int userInpt = getValidInt();
        System.out.printf("The year %d is %s leap year",
            userInpt, isLeapYear(userInpt) ? "a" : "not");
    }

    private static int getValidInt(){
        Scanner inpt = new Scanner(System.in);
        
        while (true){
            try {
                return inpt.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                inpt.nextLine();
            }
        }
    }

    // 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
    // 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
    // 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
    // 4. The year is a leap year (it has 366 days).
    // 5. The year is not a leap year (it has 365 days).
    private static boolean isLeapYear(int yr){
        if (yr % 4 == 0) {
            if (yr % 100 == 0){
                if (yr % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
