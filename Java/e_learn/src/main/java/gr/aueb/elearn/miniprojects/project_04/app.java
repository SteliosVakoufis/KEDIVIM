package gr.aueb.elearn.miniprojects.project_04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class app {
    public static void main(String[] args) {
        int[][] data = {
                { 1012, 1136 },
                { 1012, 1013 },
                { 1317, 1417 },
                { 1015, 1020 },
                { 1016, 1019 },
                { 1016, 1019 },
                { 1016, 1019 }
        };

        System.out.println(findConflictingTimes(data));

    }

    private static Integer findConflictingTimes(int[][] data) {
        Integer[] arrivals = getArrivals(data);
        Integer[] departures = getDepartures(data);

        Integer[][] sortedMerge = concatAndBias(arrivals, departures);

        Stack<Integer> garage = new Stack<>();
        Integer max = 0;

        for (Integer[] row : sortedMerge) {
            if (row[1] == 0)
                garage.add(row[0]);
            else if (row[1] == 1)
                garage.pop();
            if (garage.size() > max)
                max = garage.size();
        }

        return max;
    }

    private static Integer[][] concatAndBias(Integer[] arrA, Integer[] arrB) {
        Integer[][] result = new Integer[arrA.length + arrB.length][2];

        for (int i = 0; i < result.length; i++) {
            if (i < arrA.length) {
                result[i][0] = arrA[i];
                result[i][1] = 0;
            } else {
                result[i][0] = arrB[i - arrB.length];
                result[i][1] = 1;
            }
        }

        Arrays.sort(result, Comparator.comparingInt(o -> o[0]));
        return result;
    }

    private static Integer[] getArrivals(int[][] data) {
        Integer[] result = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i][0];
        }
        return result;
    }

    private static Integer[] getDepartures(int[][] data) {
        Integer[] result = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i][1];
        }
        return result;
    }

}
