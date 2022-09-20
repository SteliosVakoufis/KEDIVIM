package gr.aueb.elearn.miniprojects.project_09;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        String myStr = "Alice#";
        int myKey = 300;

        System.out.println("Original: " + myStr);

        ArrayList<Integer> encrypted = encrypt(myStr, myKey);
        System.out.print("Encrypted: ");
        encrypted.forEach(val -> System.out.printf("%d ", val));
        System.out.println();

        myStr = decrypt(encrypted, myKey);
        System.out.println("Decrypted: " + myStr);
    }

    private static ArrayList<Integer> encrypt(String data, int secret) {
        ArrayList<Integer> result = new ArrayList<>();

        result.add((int) data.charAt(0));
        for (int i = 1; i < data.length(); i++) {
            if (data.charAt(i) == '#')
                break;

            int previous = result.get(i - 1);
            int current = data.charAt(i);
            int sum = previous + current;
            int modulus = sum % secret;

            result.add(modulus);
        }

        result.add(-1);
        return result;
    }

    private static String decrypt(ArrayList<Integer> data, int secret) {
        StringBuilder result = new StringBuilder();

        result.append((char) (int) (data.get(0)));
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) == -1)
                break;

            int previous = data.get(i - 1);
            int current = data.get(i);
            int num = secret + current - previous;

            while (num > secret)
                num -= secret;

            result.append((char) num);
        }

        return result.toString();
    }

}
