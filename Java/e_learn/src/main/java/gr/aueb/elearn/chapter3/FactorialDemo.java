package gr.aueb.elearn.chapter3;

public class FactorialDemo {
    public static void main(String[] args) {
        int myNumber = 7;
        int factorial = 1;
        int count = myNumber;

        while (count != 1) {
            factorial *= count;
            count--;
        }

        System.out.printf("The factorial of %d, is %d", 
            myNumber, factorial);
    }
}
