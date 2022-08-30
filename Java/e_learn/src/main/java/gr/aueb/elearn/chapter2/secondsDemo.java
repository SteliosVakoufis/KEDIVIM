package gr.aueb.elearn.chapter2;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class secondsDemo {
    public static void main(String[] args) {
        final int SECONDS_IN_DAYS = 24 * 60 * 60;
        final int SECONDS_IN_HOURS = 60 * 60;
        final int SECONDS_IN_MINUTES = 60;
        Scanner inpt = new Scanner(System.in);
        int seconds = inpt.nextInt();

        TreeMap<Integer, Integer> vals = new TreeMap<>(Collections.reverseOrder());
        vals.put(SECONDS_IN_DAYS, 0);
        vals.put(SECONDS_IN_HOURS, 0);
        vals.put(SECONDS_IN_MINUTES, 0);
        vals.put(1, 0);

        System.out.printf("Input: %d\n", seconds);
        for (int key : vals.keySet()) {
            int toAdd = seconds / key;
            seconds %= key;
            vals.put(key, toAdd);
        }

        for (int key : vals.keySet()) {
            System.out.printf("key: %7d, amount: %5d\n",
                key, vals.get(key));
        }

        inpt.close();
    }
}
