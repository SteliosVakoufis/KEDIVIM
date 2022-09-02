package gr.aueb.elearn.chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBytesStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String myPath = "C:/Users/Administrator/Pictures/";
        FileInputStream fs = new FileInputStream(myPath + "sharkk.jpg");
        FileOutputStream fos = new FileOutputStream(myPath + "sharkkk.jpg");

        int b, count = 0;
        while ((b = fs.read()) != -1) {
            fos.write(b);
            count++;
        }

        System.out.println("File size = " + count);

        fs.close();
        fos.close();
    }
}
