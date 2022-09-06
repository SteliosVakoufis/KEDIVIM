package gr.aueb.elearn.chapter10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShallowDeepCopyDemo {
    public static void main(String[] args) {
        int[] myArr1 = {10, 2, 3, 3, 2, 12, 3};

        // SHALLOW COPY
        int[] myArr2 = myArr1;

        // DEEP COPY
        int[] myArr3 = Arrays.copyOf(myArr1, myArr1.length);
        Arrays.stream(myArr3).forEach(val -> System.out.printf("%d ", val));
        System.out.println();
    }
}
