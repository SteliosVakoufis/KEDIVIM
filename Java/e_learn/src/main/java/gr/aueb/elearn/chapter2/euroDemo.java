package gr.aueb.elearn.chapter2;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Converts euro to
 * bills of [500, 100, 50, 20, 10]
 * and coins of 1 euro
 */
public class euroDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> change = new TreeMap<>(Collections.reverseOrder());
        change.put(500, 0);
        change.put(100, 0);
        change.put(10, 0);
        change.put(1, 0);
        change.put(50, 0);
        change.put(20, 0);

        Scanner inpt = new Scanner(System.in);
        int userInput = inpt.nextInt();

        System.out.printf("Input: %d\n", userInput);
        for (int key : change.keySet()) {
            int toAdd = userInput / key;
            userInput %= key;
            change.put(key, toAdd);
        }

        for (int key : change.keySet()) {
            System.out.printf("key: %7d, amount: %5d\n",
                key, change.get(key));
        }

        inpt.close();
    }
}
