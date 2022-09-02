package gr.aueb.elearn.chapter7.exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        String user_input;

        System.out.println("Give me a string to encrypt it.");
        user_input = inpt.nextLine();

        user_input = encryptString(user_input);
        System.out.printf("\nThe string you gave has been encrypted to:\n%s\n\n", user_input);

        user_input = decryptString(user_input);
        System.out.printf("The encrypted string has been decrypted to:\n%s", user_input);

        inpt.close();
    }

    public static String encryptString(String str){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(Integer.toHexString((int) str.charAt(i)));
        }

        return result.toString();
    }
    
    public static String decryptString(String str){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            String hexVal = "#" + str.charAt(i) + "" +  str.charAt(i + 1);
            int decVal = Integer.decode(hexVal);
            result.append((char)decVal);
        }

        return result.toString();
    }
}
