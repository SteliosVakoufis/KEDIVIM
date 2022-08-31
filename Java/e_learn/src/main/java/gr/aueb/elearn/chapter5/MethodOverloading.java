package gr.aueb.elearn.chapter5;


public class MethodOverloading {
    public static void main(String[] args) {
        System.out.printf("The sum of 0, 4, 5, 3, 1, 10, 3, 44, 5 is %d",
            addition(0, 4, 5, 3, 1, 10, 3, 44, 5)
        );
    }

    private static int addition(int ...arr){
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

}
