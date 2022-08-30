package gr.aueb.elearn.chapter3;

public class NestedIfGradesDemo {
    public static void main(String[] args) {
        int[] nums = new int[getRand(10)];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100);
        }

        for (int i : nums) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();

        sum /= nums.length;
        System.out.println("Average: " + sum);

    }

    private static int getRand(int a){
        return (int)(Math.random() * a) + 1;
    }
}
