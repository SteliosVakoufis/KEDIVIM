package gr.aueb.elearn.chapter10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Grid15Demo {
    public static void main(String[] args) {
        int[][] myArr = {
                { 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }
        };

        System.out.println(isFifteen(myArr));

    }

    private static boolean isFifteen(int[][] arr) {
        if (arr.length != 3)
            return false;
        if (arr[0].length != 3 || arr[1].length != 3 || arr[2].length != 3)
            return false;

        for (int i = 0; i < arr.length; i++) {
            int sumRow = 0;
            int sumColumn = 0;
            for (int j = 0; j < arr.length; j++) {
                sumRow += arr[i][j];
                sumColumn += arr[j][i];
            }
            if (sumRow != 15 && sumColumn != 15) {
                return false;
            }
        }

        return true;
    }

}
