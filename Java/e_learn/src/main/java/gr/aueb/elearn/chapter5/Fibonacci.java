package gr.aueb.elearn.chapter5;

public class Fibonacci {
    public static void main(String[] args) {
        int myNum = 7;
        System.out.println(getFibo(myNum));
    }

    private static int getFibo(int a){
        return a <= 1 ? a : getFibo(a - 1) + getFibo(a - 2);
    }

}
