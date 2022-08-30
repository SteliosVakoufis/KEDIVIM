package gr.aueb.elearn.chapter3;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int result = 0;

        while (true) {
            if (i == 10) break;
            i++;
            System.out.println(i);
        }

        while (j <= 10) {
            j++;
            if (j % 2 == 0) continue;
            result += j;
            System.out.print(j + " ");
        }
        System.out.println(result);
    }
}
