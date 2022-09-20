package gr.aueb.elearn.miniprojects.project_07;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int[][] myArr = new int[3][5];

        populateArray(myArr);
        printArr(myArr, "myArr1 Initial.");

        int[][] myArr2 = shallowCopy(myArr);
        populateArray(myArr2);
        printArr(myArr, "myArr1 after shallowCopy and randomisation to myArr2.");
        printArr(myArr2, "myArr2 after shallowCopy and randomisation to myArr2.");

        int[][] myArr3 = deepCopy(myArr);
        populateArray(myArr3);
        printArr(myArr, "myArr1 after deepCopy and randomisation to myArr3.");
        printArr(myArr3, "myArr3 after deepCopy and randomisation to myArr3.");

    }

    private static int[][] deepCopy(int[][] arr){
        int[][] result = new int[arr.length][arr[0].length];
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return result;
    }

    private static int[][] shallowCopy(int[][] arr) {
        int[][] result = arr;
        return result;
    }

    // Helper Functions
    private static void printArr(int[][]arr, String s){
        System.out.println(s);
        for (int[] row : arr) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void populateArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }

}
