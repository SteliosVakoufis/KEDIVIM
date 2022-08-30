package gr.aueb.elearn.chapter2;

// Math demo!!!!!!!!!!!!!
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Random integer number from 1 to 1000!!!!\n" +
                (int)(Math.random() * 1001) + 1);

        System.out.printf("The absolute of -5 is... %d\n",
                Math.abs(-5));
        System.out.printf("The minimum of 2 and 10 is... %d\n",
                Math.min(2, 10));
        System.out.printf("The maximum of 2 and 10 is... %d\n",
                Math.max(2, 10));

//        int a = 10L / 9;
    }
}
