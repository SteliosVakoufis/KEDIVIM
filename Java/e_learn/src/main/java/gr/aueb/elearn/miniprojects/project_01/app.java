package gr.aueb.elearn.miniprojects.project_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class app {

    private static final String PATH = "./src/main/java/gr/aueb/elearn/miniprojects/project_01/resources/";

    public static void main(String[] args) throws IOException {
        // initRawNumbers(25);

        ArrayList<Integer> rawNumbers = getRawNumbers();
        ArrayList<Integer> sortedNumbers = sortNumbers(rawNumbers);
        ArrayList<Integer[]> numberSets = getNumberSets(sortedNumbers);
        ArrayList<Integer[]> filteredNumbers = filterNumbers(numberSets);

        saveNumbersToFile(filteredNumbers);
    }

    private static ArrayList<Integer[]> filterNumbers(ArrayList<Integer[]> list) {
        ArrayList<Integer[]> result = new ArrayList<>(list);

        for (int i = 0; i < result.size(); i++) {
            if (isEvenSet(result.get(i), 4))
                result.remove(i);
            else if (isOddSet(result.get(i), 4))
                result.remove(i);
            else if (hasConsecutiveNumbers(result.get(i), 2))
                result.remove(i);
            else if (hasSameEnds(result.get(i), 3))
                result.remove(i);
            else if (hasSameTen(result.get(i), 3))
                result.remove(i);
        }

        return result;
    }

    private static boolean hasSameEnds(Integer[] arr, int n) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (Integer val : arr) {
            int tens = val % 10;
            if (counter.containsKey(tens))
                counter.put(tens, counter.get(tens) + 1);
            counter.put(tens, 1);
        }

        for (Integer key : counter.keySet()) {
            if (counter.get(key) > n)
                return true;
        }

        return false;
    }

    private static boolean hasSameTen(Integer[] arr, int n) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (Integer val : arr) {
            int tens = val / 10;
            if (counter.containsKey(tens))
                counter.put(tens, counter.get(tens) + 1);
            counter.put(tens, 1);
        }

        for (Integer key : counter.keySet()) {
            if (counter.get(key) > n)
                return true;
        }

        return false;
    }

    private static boolean hasConsecutiveNumbers(Integer[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] == 1)
                count++;
            else
                count = 0;
            if (count > n)
                return true;
        }

        return false;
    }

    private static Boolean isEvenSet(Integer[] arr, int n) {
        int count = 0;
        for (Integer val : arr) {
            if (val % 2 == 0)
                count++;
            if (count > n)
                return false;
        }
        return true;
    }

    private static Boolean isOddSet(Integer[] arr, int n) {
        int count = 0;
        for (Integer val : arr) {
            if (val % 2 == 1)
                count++;
            if (count > n)
                return false;
        }
        return true;
    }

    private static ArrayList<Integer[]> getNumberSets(ArrayList<Integer> list) {
        ArrayList<Integer[]> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
            for (int j = i + 1; j < list.size(); j++)
                for (int j2 = j + 1; j2 < list.size(); j2++)
                    for (int k = j2 + 1; k < list.size(); k++)
                        for (int k2 = k + 1; k2 < list.size(); k2++)
                            for (int l = k2 + 1; l < list.size(); l++)
                                result.add(new Integer[] {
                                        list.get(i), list.get(j), list.get(j2), list.get(k), list.get(k2), list.get(l)
                                });

        return result;
    }

    // Sorts items and removes duplicates.
    private static ArrayList<Integer> sortNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        SortedSet<Integer> uinqueValues = new TreeSet<>();

        for (Integer val : list) {
            if (!uinqueValues.contains(val))
                uinqueValues.add(val);
        }

        for (Integer val : uinqueValues) {
            result.add(val);
        }

        return result;
    }

    private static ArrayList<Integer> getRawNumbers() {
        File raw_numbers = new File(PATH + "raw_numbers.txt");
        ArrayList<Integer> result = new ArrayList<>();

        try (Scanner inpt = new Scanner(raw_numbers)) {
            while (inpt.hasNext()) {
                int num = inpt.nextInt();
                if (num == -1)
                    break;
                result.add(num);
            }
            inpt.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

    private static void initRawNumbers(int n) throws IOException {
        File raw_numbers = new File(PATH + "raw_numbers.txt");

        FileWriter fw = new FileWriter(raw_numbers);
        for (int i = 1; i < n; i++) {
            int random = (int) (Math.random() * 49 + 1);
            String toAppend = String.valueOf(random) + "\n";
            fw.append(toAppend);
        }
        fw.append("-1\n");
        fw.close();
    }

    private static void saveNumbersToFile(ArrayList<Integer[]> list) throws IOException {
        File raw_numbers = new File(PATH + "filtered_numbers.txt");

        FileWriter fw = new FileWriter(raw_numbers);

        for (Integer[] row : list) {
            String toAppend = row[0] + " " + row[1] + " " + row[2] + " " + row[3] + " " + row[4] + " " + row[5] + "\n";
            fw.append(toAppend);
        }
        fw.close();
    }

}
