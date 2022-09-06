package gr.aueb.elearn.chapter10.exercises;

import java.util.ArrayList;

// Encrypt Decrypt Message something something
public class Ex1 {
    public static void main(String[] args) {
        // String message = "Hey, how is it going? This message doesn't contain any
        // secrets for sure.#";
        String message = "Hello, how is it going?#";
        int secret = 168;

        String encryptedMessage = cipher(message, secret);
        String decryptedMessage = decryptCipher(encryptedMessage, secret);

        System.out.printf("Original message is: %s\n", message);
        System.out.printf("Encrypted message is: %s\n", encryptedMessage);
        System.out.printf("Decrypted message is: %s\n", decryptedMessage);

    }

    private static String cipher(String msg, int secret) {
        if (msg.length() == 0)
            return "?";
        ArrayList<Integer> decimalVals = new ArrayList<>();

        decimalVals.add((int) msg.charAt(0));
        for (int i = 1; i < msg.length(); i++) {
            if (msg.charAt(i) == '#') {
                decimalVals.add(-1);
                break;
            }
            int additionWithPrev = (int) msg.charAt(i) + (int) msg.charAt(i - 1);
            int moduloWithSecret = additionWithPrev % secret;
            decimalVals.add(moduloWithSecret);
        }

        StringBuilder result = new StringBuilder();
        for (Integer val : decimalVals) {
            result.append(val + " ");
        }

        return result.toString();
    }

    private static String decryptCipher(String msg, int secret) {
        if (msg.length() == 0)
            return "?";
        ArrayList<Integer> decimalVals = stringToArrayList(msg);
        StringBuilder result = new StringBuilder();

        result.append((char) (int) decimalVals.get(0));
        for (int i = 1; i < decimalVals.size(); i++) {
            if (decimalVals.get(i) == -1)
                break;
            int num = decimalVals.get(i) - decimalVals.get(i - 1) + secret;
            decimalVals.set(i, num);

            
            System.out.print(num + " ");
            
            do {
                if (num > secret)
                    num -= secret;
            } while (num > secret);

            System.out.print(num + " ");

            result.append((char) num);
        }

        System.out.println();
        return result.toString();
    }

    private static ArrayList<Integer> stringToArrayList(String data) {
        ArrayList<Integer> result = new ArrayList<>();
        String[] values = data.split(" ");

        for (String str : values) {
            int val = Integer.parseInt(str);
            result.add(val);
            if (val == -1) {
                break;
            }
        }

        return result;
    }
}
