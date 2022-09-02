package gr.aueb.elearn.chapter8;

import java.io.IOException;

public class CharReadExceptionDemo {
    public static void main(String[] args) {
        char ch;
        try {
            ch = getChar();
        } catch (IOException e) {
            System.out.println("Λαθος ρε");
        }
    }


    private static char getChar() throws IOException{
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e);
            throw e;
        }
    }

}
