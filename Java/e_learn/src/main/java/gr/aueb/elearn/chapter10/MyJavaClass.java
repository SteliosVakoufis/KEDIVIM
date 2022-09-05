package gr.aueb.elearn.chapter10;

import java.util.ArrayList;

public class MyJavaClass {
    public static void main(String[] args) {
        int[] myArr = { 1, 5, 8, 12, 14, 16, 23, 24, 26, 31, 33 };
        ArrayList<int[]> myList = new ArrayList<>();

        // O(n^4)
        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                for (int j2 = j + 1; j2 < myArr.length; j2++) {
                    for (int k = j2 + 1; k < myArr.length; k++) {
                        myList.add(new int[] { myArr[i], myArr[j], myArr[j2], myArr[k] });
                        checkLastEven(myList);
                    }
                }
            }
        }

        myList.forEach(arr -> System.out.printf("%d %d %d %d\n",
                arr[0], arr[1], arr[2], arr[3]));

    }

    private static void checkLastEven(ArrayList<int[]> list) {
        int[] check = list.get(list.size() - 1);
        int evenCount = 0;
        int tolerance = 4;

        for (int val : check) {
            if (val % 2 == 0)
                evenCount++;
        }

        if (!(evenCount <= tolerance)){
            System.out.println("Removed " + list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }

}
