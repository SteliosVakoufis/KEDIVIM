package gr.aueb.elearn.chapter6;

import java.util.ArrayList;

public class QuicksortArrayList {
    public static void main(String[] args) {
        final int SIZE = 10, RANGE = 100;
        ArrayList<Integer> myArr = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            myArr.add((int)(Math.random() * RANGE));
        }

        myArr.forEach(val -> System.out.printf("%d ", val));
        System.out.println();

        myArr = quickSort(myArr);

        myArr.forEach(val -> System.out.printf("%d ", val));
    }

    private static ArrayList<Integer> quickSort (ArrayList<Integer> arr){
        if (arr.size() == 0) return arr;
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        int pivot = arr.get(arr.size() / 2);

        for (Integer val : arr) {
            if (pivot > val) leftArr.add(val);
            if (pivot < val) rightArr.add(val);
        }

        return concatArrayList(quickSort(leftArr), quickSort(rightArr), pivot);
    }

    private static ArrayList<Integer> concatArrayList (ArrayList<Integer> arrA, ArrayList<Integer> arrB, int pivot){
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(arrA);
        result.add(pivot);
        result.addAll(arrB);
        return result;
    }
}
