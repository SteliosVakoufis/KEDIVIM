package gr.aueb.elearn.chapter6;

import java.util.Arrays;

public class MinMaxArrayValue {
    public static void main(String[] args) {
        final int SIZE = 10, RANGE = 100;
        int[] myArr = new int[SIZE];
        
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int)(Math.random() * RANGE);
        }
        Arrays.stream(myArr).forEach(val -> System.out.printf("%d, ", val));
        System.out.println();

        int[] minMax = getMinMax(myArr);

        System.out.printf("Min: %d, Max: %d",
            minMax[0], minMax[1]
        );

    }
    
    private static int[] getMinMax(int[] arr) {
        int[] min_max = {Integer.MAX_VALUE, Integer.MIN_VALUE};

        for (int val : arr) {
            if (val < min_max[0]) min_max[0] = val;
            else if (val > min_max[1]) min_max[1] = val;
        }

        return min_max;
    }
}
