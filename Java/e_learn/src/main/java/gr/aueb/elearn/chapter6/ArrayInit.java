package gr.aueb.elearn.chapter6;

import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {
        int[] myArr = {
            4, 5, 6, 7, 8, 9
        };

        Arrays.stream(myArr)
            .forEach(val -> System.out.printf("%d ", val))
        ;
        
        System.out.println();
    }
}
