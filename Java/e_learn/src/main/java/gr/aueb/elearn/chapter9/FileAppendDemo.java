package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class FileAppendDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
        String myPath = "./src/main/java/gr/aueb/elearn/chapter9/resources/";
        FileOutputStream myFile1 = new FileOutputStream(
            myPath + "file1.txt", true
        );
        FileOutputStream myFile2 = new FileOutputStream(
            myPath + "file2.txt", true
        );

        PrintStream ps = new PrintStream(myFile1);
        ps.println("Hello Hello?\n");

        PrintStream ps2 = new PrintStream(myFile2, true, "UTF-8");
        ps2.println("yay\n");
    }
}
