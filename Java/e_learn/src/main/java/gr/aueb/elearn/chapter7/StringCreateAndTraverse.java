package gr.aueb.elearn.chapter7;

public class StringCreateAndTraverse {
    public static void main(String[] args) {
        String myStr = "Hello there! How are you doing??";

        for (char chr : myStr.toCharArray()) {
            System.out.print(chr);
        }
        System.out.println();

    }
}
