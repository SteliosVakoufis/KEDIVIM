package gr.aueb.elearn.chapter6;

import java.util.Arrays;

public class MinMaxArrayIndexes {
    public static void main(String[] args) {
        final int SIZE = 10, RANGE = 100;
        int[] myArr = new int[SIZE];
        
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int)(Math.random() * RANGE);
        }
        Arrays.stream(myArr).forEach(val -> System.out.printf("%d, ", val));
        System.out.println();

        int[] minMax = getMinMax(myArr);

        System.out.printf("Min: %d, Max: %d\n",
            minMax[0], minMax[1]
        );

        int[] minMaxIndexes = getMinMaxPos(myArr);

        System.out.printf("Min index: %d, Max index: %d\n",
        minMaxIndexes[0], minMaxIndexes[1]
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
    
    private static int[] getMinMaxPos(int[] arr) {
        int[] min_max = {0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[min_max[0]] > arr[i]) {min_max[0] = i;}
            else if (arr[min_max[1]] < arr[i]) {min_max[1] = i;}
        }

        return min_max;
    }

}
