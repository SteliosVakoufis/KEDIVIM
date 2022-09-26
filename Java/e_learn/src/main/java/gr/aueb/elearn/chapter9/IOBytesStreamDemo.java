package gr.aueb.elearn.chapter9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBytesStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String myPath = "C:/Users/Administrator/Pictures/";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myPath + "sharkk.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(myPath + "sharkkk.jpg"));

        long timeStart = 0, timeEnd = 0;
        double elapseTime = 0.0;

        timeStart = System.currentTimeMillis();

        try (bis; bos){
            while (bis.available() != 0) {
                // bos.write(bis, 0, bis.read());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }

        timeEnd = System.currentTimeMillis();
        elapseTime = (timeEnd - timeStart);

        System.out.println("Time: " + elapseTime + "ms");

        bis.close();
        bos.close();
    }
}
