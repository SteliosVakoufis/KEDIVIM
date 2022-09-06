package gr.aueb.elearn.chapter10;

public class PalindromeDemo {
    public static void main(String[] args) {
        String myString = "madam";

        System.out.println(isPalindrome(myString));
    }

    private static Boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while(low != high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}
