package gr.aueb.elearn.chapter6;

import java.util.Arrays;

public class UnsizedInit {
    public static void main(String[] args) {
        int[] myArr = {6, 9, 9, 6, 9, 6, 6, 6};
        Arrays.stream(myArr).forEach(System.out::println);
    }
}
