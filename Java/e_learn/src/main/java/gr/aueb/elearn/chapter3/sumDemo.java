package gr.aueb.elearn.chapter3;

public class sumDemo {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.printf("Sum is: %d", sum);
    }
}
