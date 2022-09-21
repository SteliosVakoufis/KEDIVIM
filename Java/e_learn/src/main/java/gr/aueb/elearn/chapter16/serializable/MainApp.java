package gr.aueb.elearn.chapter16.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApp {
    private final static String PATH = "./src/main/java/gr/aueb/elearn/chapter16/serializable/resources/";

    public static void main(String[] args) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(PATH + "trainee.ser"));

            Trainee alice = new Trainee("Alice", new City("Athens"));
            oos.writeObject(alice);
            System.out.println("Object successfully saved!");

            oos.close();
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream oos = new ObjectInputStream(
                    new FileInputStream(PATH + "trainee.ser"));

            Trainee alice;
            alice = (Trainee) oos.readObject();
            System.out.println("Object successfully saved!");

            System.out.println(alice);
            oos.close();
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
