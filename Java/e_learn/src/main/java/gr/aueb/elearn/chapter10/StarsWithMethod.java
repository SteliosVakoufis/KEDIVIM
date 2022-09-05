package gr.aueb.elearn.chapter10;

public class StarsWithMethod {
    public static void main(String[] args) {
        printStarsHV(4, 10);
    }

    private static void printStarsH(int n) {
        System.out.println("*".repeat(n));
    }

    private static void printStarsHV(int n, int m) {
        for (int i = 0; i < n; i++) {
            printStarsH(m);
        }
    }

}
