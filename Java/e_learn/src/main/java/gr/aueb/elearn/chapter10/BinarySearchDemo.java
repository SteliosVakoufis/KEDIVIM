package gr.aueb.elearn.chapter10;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] myArr = {10, 12, 35, 41, 42, 51, 61, 90};

        System.out.println(binarySearch(myArr, 41));
    }

    private static int binarySearch(int[] arr, int value) {
        return binarySearch(arr, 0, arr.length - 1, value);
    }

    private static int binarySearch(int[] arr, int low, int high, int value) {
        int median = low + high / 2;
        if (median > value) 
            low = median + 1;
        else
            high = median - 1;

        return value == arr[median] ? value : binarySearch(arr, low, high, value);
    }

}
