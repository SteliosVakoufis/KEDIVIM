package gr.aueb.elearn.chapter4;

import java.util.Scanner;

// Lamvani va8mo
public class SwitchFallThroughDemo {
    public static void main(String[] args) {
        int grade = getValidInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("FAILED");
                break;
            case 5:
            case 6:
                System.out.println("OK");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("JEFTERI MOU ESY!");
                break;
            default:
                System.out.println("a number through 1 - 10 is all I Want...");
                break;
        }
        
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

}
