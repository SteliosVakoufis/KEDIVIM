package gr.aueb.elearn.chapter2;
import java.util.Locale;

public class OverflowTypecastDemo {
    public static void main(String[] args) {
        long num = 2_147_483_648L;

        int i = 20;
        long myLong = 40;

        i = (int)myLong;
        System.out.println(i);

        long result = myLong + 3;

        System.out.println(result);
        System.out.println("To apotelesma einai: " + result);
        System.out.printf("To apotelesma einai: %.3f\n", 100.02331f);
        System.out.printf(Locale.US, "To apotelesma einai: %,d", num);
    }
}
