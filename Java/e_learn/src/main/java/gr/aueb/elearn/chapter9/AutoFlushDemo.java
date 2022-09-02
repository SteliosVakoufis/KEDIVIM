package gr.aueb.elearn.chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AutoFlushDemo {
    public static void main(String[] args) throws FileNotFoundException{
        String myPath = "./src/main/java/gr/aueb/elearn/chapter9/resources/";
        FileOutputStream myFile1 = new FileOutputStream(myPath + "file1.txt");
        FileOutputStream myFile2 = new FileOutputStream(myPath + "file2.txt");
        PrintStream ps = new PrintStream(myFile1, true);
        PrintWriter pw = new PrintWriter(myFile2, true);

        printMessage(ps, "Hello there!");
        printMessage(pw, "Hello");
        printMessage(System.out, "How is it going bruh");
        
    }

    private static void printMessage(PrintStream ps, String message){
        if (ps != null) {
            ps.println(message);
            ps.flush();
        }
    }

    private static void printMessage(PrintWriter pw, String message){
        if (pw != null) {
            pw.println(message);
            pw.flush();
        }
    }

}
