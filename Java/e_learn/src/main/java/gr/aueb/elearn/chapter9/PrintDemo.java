package gr.aueb.elearn.chapter9;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo {
    public static void main(String[] args) {
        String myPath = "./src/main/java/gr/aueb/elearn/chapter9/resources/";
        
        try (
            PrintStream ps = new PrintStream(myPath + "file1.txt", "UTF-8");
            PrintWriter pw = new PrintWriter(myPath + "file2.txt", "Windows-1252");
            ){
            ps.println("Hello001");
            pw.println("Hello002");
            pw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
