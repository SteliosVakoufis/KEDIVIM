package gr.aueb.elearn.chapter9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        final String MY_PATH = "./src/main/java/gr/aueb/elearn/chapter9/resources/";

        try (BufferedReader reader = new BufferedReader(
                new FileReader(MY_PATH + "file1.txt"))) {
            PrintStream pStream = new PrintStream(MY_PATH + "file2.txt");

            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
                pStream.println(line);
            }
            
            pStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
