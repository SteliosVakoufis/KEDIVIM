package gr.aueb.elearn.miniprojects.project_05;

public class app {
    public static void main(String[] args) {
        Integer[] myArr = { 0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8 };

        Integer[] set = findRepeatingElementStartEnd(myArr, 8);

        System.out.printf("%d -> %d", set[0], set[1]);

    }

    private static Integer[] findRepeatingElementStartEnd(Integer[] arr, Integer key) {
        Integer low = 0, high = arr.length - 1;

        while (arr[low] != key || arr[high] != key) {
            if (arr[low] != arr[key])
                low++;
            if (arr[high] != arr[key])
                high--;
        }

        return new Integer[] {low, high};
    }
    
}
