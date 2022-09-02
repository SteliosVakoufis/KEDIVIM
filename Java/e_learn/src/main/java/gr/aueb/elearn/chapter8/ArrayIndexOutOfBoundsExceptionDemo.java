package gr.aueb.elearn.chapter8;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] myArr = {10, 432, 30, 3, 42, 4, 2, 5, 245, 2};

        for (int i = 0; i <= myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}