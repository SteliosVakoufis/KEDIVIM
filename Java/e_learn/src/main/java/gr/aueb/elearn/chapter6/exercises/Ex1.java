package gr.aueb.elearn.chapter6.exercises;

import java.util.ArrayList;
import java.util.Arrays;

// Had some fun making this one :-)
public class Ex1 {
    public static void main(String[] args) {
        final int ARR_SIZE = 10, VAL_RANGE = 100;

        int[] unSorted = new int[ARR_SIZE];
        int[] sorted = new int[ARR_SIZE];

        for (int i = 0; i < unSorted.length; i++) {
            unSorted[i] = (int)(Math.random() * VAL_RANGE);
        }

        System.out.println("\nUnsorted Array");
        for (int val : unSorted) {
            System.out.printf("%d ", val);
        }
        System.out.println("\n\n-------------------------\n");

        System.out.println("Sorted array");
        sorted = quickSort(unSorted);
        Arrays.stream(sorted).forEach(val -> System.out.printf("%d ", val));
        System.out.println("\n\n-------------------------\n");
        
        System.out.printf("The value you are looking for is ->%d<-\n",
            sorted[1]
        );
    }

    private static int[] quickSort(int[] arr){
        if (arr.length <= 1) return arr;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();
        int pivot = arr[arr.length / 2];

        for (int val : arr) {
            if (val < pivot) leftArr.add(val);
            else if (val > pivot) rightArr.add(val);
        }

        return concatIntArrays(quickSort(listToArray(leftArr)), quickSort(listToArray(rightArr)), pivot);
    }

    private static int[] concatIntArrays(int[] a, int[] b, int p){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int val : a) arr.add(val);
        arr.add(p);
        for (int val : b) arr.add(val);

        return listToArray(arr);
    }

    private static int[] listToArray(ArrayList<Integer> arr){
        int[] result = new int[arr.size()];
        for (int i = 0; i < result.length; i++) result[i] = arr.get(i);

        return result;
    }
}
