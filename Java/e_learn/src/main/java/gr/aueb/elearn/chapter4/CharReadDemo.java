package gr.aueb.elearn.chapter4;

import java.io.IOException;

public class CharReadDemo {
    public static void main(String[] args) throws IOException
    {
        char ch = ' ';

        do {
            System.out.println("Give me a character!");
            ch = (char) System.in.read();
            System.in.skip(2);
            System.out.println(ch);
        } while (ch != '!');

        int[] arr = {10, 10, 124, 23382, 992, -102};

        for (int val : arr) {
            System.out.println(val);
        }

    }
}
