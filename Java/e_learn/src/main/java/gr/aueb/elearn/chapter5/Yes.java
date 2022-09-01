package gr.aueb.elearn.chapter5;

public class Yes {
    public static void main(String[] args) {
        int num = 4;
        int pow = 8;

        System.out.printf("%d^%d is %d",
            num, pow, getPowOf(num, pow)
        );
    }

    private static int getPowOf(int a, int b){
        return b == 0 ? 1 : a * getPowOf(a, b - 1);
    }

}
