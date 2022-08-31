package gr.aueb.elearn.chapter4;

// asteraki mou lampro fegke mou na grafw kodika
public class Stars10 {
    public static void main(String[] args) {
        final int MY_NUM = 1;
        stars(MY_NUM);
    }

    private static void stars(int repeats){
        final int SIZE = 5;

        for (int a = 0; a < repeats; a++) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
               System.out.println("*"); 
            }
            for (int i = SIZE; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
               System.out.println("*"); 
            }
        }
    }
}
