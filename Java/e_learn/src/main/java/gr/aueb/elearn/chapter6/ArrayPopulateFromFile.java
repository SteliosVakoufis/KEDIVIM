package gr.aueb.elearn.chapter6;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPopulateFromFile {
    public static void main(String[] args) {
        final String FILE_PATH = "./src/main/java/gr/aueb/elearn/chapter6/resources/array_input.txt";
        File myFile = new File(FILE_PATH);

        ArrayList<String> myList = new ArrayList<>();
        try (Scanner fStream = new Scanner(myFile)) {
            while(fStream.hasNext()) {
                myList.add(fStream.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        myList.forEach(System.out::println);

    }
}
