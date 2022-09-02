package gr.aueb.elearn.chapter6;

public class Array2d {
    public static void main(String[] args) {
        int[][] myArr = {
            {10, 4, 88},
            {12, 0, 5},
            {20, 1, 20},
            {550, 2, 1}
        };

        for (int[] row : myArr) {
            for (int val : row) {
                System.out.printf("%d ", val);
            }
            System.out.println();
        }
    }
}
