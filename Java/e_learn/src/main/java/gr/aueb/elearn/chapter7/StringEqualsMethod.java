package gr.aueb.elearn.chapter7;

public class StringEqualsMethod {
    public static void main(String[] args) {
        String myStr = "a";
        String compareTo = "a";

        System.out.printf("%s compared to %s\n%d",
            myStr, compareTo, compareStrings(myStr, compareTo)
        );
    }

    private static boolean areStringsEqual(String a, String b){
        return (a != null && b != null) ? a.equals(b) : false;
    }

    private static int compareStrings(String a, String b){
        return (a != null && b != null) ? a.compareTo(b) : -100;
    }

}

