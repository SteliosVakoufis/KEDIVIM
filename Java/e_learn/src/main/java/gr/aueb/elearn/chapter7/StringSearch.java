package gr.aueb.elearn.chapter7;

public class StringSearch {
    public static void main(String[] args) {
        String myStr = "Top 10 builds for Path of Exile 3.19!";
        String checkMatch = "Kalandra Builds";

        System.out.printf("the letters \"%s\" %s",
            checkMatch, myStr.contains(checkMatch) ? "exist!" : "don't exist!"
        );

    }
}
