package gr.aueb.elearn.chapter1;
import java.util.Scanner;

// IntelliJ is the bane of my existence.
public class HelloWorld {
    public static void main(String[] args) {
        String myStr = "Hello WORLD!";
        int executionNumber = (int)(Math.random() * 100);

        System.out.println("The string is gonna be printed "
                + executionNumber + " times!");

        for (int i = 0; i < executionNumber; i++) {
            System.out.println(myStr);
        }

        int a = 10, b = 25;
        System.out.printf("\nThe sum between the values %d and %d is %d\n",
                a, b, ExpressionDemo.sum(a, b));

        playAGame();
    }

    private static void playAGame(){
        int target = (int)(Math.random() * 10);
        int current = Integer.MIN_VALUE;
        Scanner inpt = new Scanner(System.in);

        System.out.println("You are stuck in here \nuntil you figure it out \n:)");
        while (true){
            try {
                current = inpt.nextInt();
            } catch(Exception e){
                System.out.println(e);
                inpt.next();
                continue;
            }

            if (current == target){
                System.out.println("Congratulations you are free!");
                break;
            }
            if (current > target){
                System.out.println("Guess lower!!!");
            }else {
                System.out.println("Guess higher!!!");
            }
        }

        inpt.close();
    }
}
