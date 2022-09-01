package gr.aueb.elearn.chapter6;

import java.util.Arrays;

public class getArrayPosition {
    public static void main(String[] args) {
        final int SIZE = 100, RANGE = 100;
        int[] myArr = new int[SIZE];
        
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int)(Math.random() * RANGE);
        }
        Arrays.stream(myArr).forEach(val -> System.out.printf("%d ", val));
        System.out.println();

        int lookingFor = 32;
        System.out.printf("%d is at pos: %d",
            lookingFor, searchArray(myArr, lookingFor)
        );
    }

    private static int searchArray(int[] arr, int a){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) return i;
        }
        return -1;
    }

}
