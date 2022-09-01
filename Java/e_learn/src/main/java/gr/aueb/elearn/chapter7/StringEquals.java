package gr.aueb.elearn.chapter7;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        System.out.printf("%b\n",
            s1.equals(s2)
        );

        System.out.printf("%b\n",
            s1.equalsIgnoreCase(s2)
        );

    }
}
