package gr.aueb.elearn.miniprojects.project_06;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        Integer[] myArr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        ArrayList<Integer> maxSumArray = findMaxSumSubarray(myArr);

        maxSumArray.forEach(val -> System.out.printf("%d ", val));
    }

    // Kadane's Algorithm Implementation.
    private static ArrayList<Integer> findMaxSumSubarray(Integer[] arr) {
        ArrayList<Integer> maxSumSubarray = new ArrayList<>();
        Integer maxSum = Integer.MIN_VALUE;

        Integer maxCounter = 0;
        ArrayList<Integer> maxCountingSubarray = new ArrayList<>();
        // O(n) obviously
        for (int i = 0; i < arr.length; i++) {
            maxCounter += arr[i];
            maxCountingSubarray.add(arr[i]);

            if (maxCounter < arr[i]) {
                maxCounter = arr[i];

                maxCountingSubarray.clear();
                maxCountingSubarray.add(arr[i]);
            }
            if (maxSum < maxCounter) {
                maxSum = maxCounter;

                maxSumSubarray = new ArrayList<>(maxCountingSubarray);
            }
        }

        return maxSumSubarray;
    }
}
