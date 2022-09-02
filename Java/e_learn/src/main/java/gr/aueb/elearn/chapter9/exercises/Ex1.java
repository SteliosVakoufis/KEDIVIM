package gr.aueb.elearn.chapter9.exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Something something
public class Ex1 {

    private static String FILE_PATH = "./src/main/java/gr/aueb/elearn/chapter9/exercises/";

    public static void main(String[] args) throws IOException{
        File inputFile = new File(FILE_PATH + "primIn.txt");
        File logs = new File(FILE_PATH + "logs.txt");
        if (logs.exists()) logs.delete();

        ArrayList<String[]> dataToProcess;
        ArrayList<String[]> processedData;
        try {
            dataToProcess = getData(inputFile);
            processedData = calcAverages(dataToProcess);
            saveProcessedData(processedData);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (Exception e) {
            System.err.println("uhmm.. woops??");
            e.printStackTrace();
        }

    }

    private static ArrayList<String[]> getData(File file) throws FileNotFoundException{
        ArrayList<String[]> data = new ArrayList<>();

        try {
            Scanner reader = new Scanner(file);

            int line = 0;
            while (reader.hasNext()) {
                line++;
                String[] s = reader.nextLine().split(" ");
                if (validateProcessData(s, line)) data.add(s);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            logError(e);
            throw e;
        }

        return data;
    }

    private static boolean validateProcessData(String[] str, int line) {
        if (str.length == 4)
            if (str[0].matches("[aA-zZ]+") && str[1].matches("[aA-zZ]+") && str[2].matches("^[0-9]+$") && str[3].matches("^[0-9]+$"))
                if (Integer.parseInt(str[2]) >= 0 && Integer.parseInt(str[2]) <= 10 && Integer.parseInt(str[3]) >= 0 && Integer.parseInt(str[3]) <= 10)
                    return true;

        logError(str, line);
        return false;
    }

    private static ArrayList<String[]> calcAverages(ArrayList<String[]> dataList) {
        ArrayList<String[]> result = new ArrayList<>();
        
        for (String[] data : dataList) {
            String[] temp = new String[3];
            temp[0] = data[0];
            temp[1] = data[1];
            temp[2] = Integer.toString(((Integer.parseInt(data[2]) + Integer.parseInt(data[3])) / 2)); 
            result.add(temp);
        }
        
        return result;
    }

    private static void saveProcessedData (ArrayList<String[]> dataList) {
        try (BufferedWriter logger = new BufferedWriter(new FileWriter(FILE_PATH + "primOut.txt"))) {
            for (String[] data : dataList) {
                logger.append(String.join(" ", data) + "\n");
            }
            logger.close();
        } catch (Exception e) {
            
            logError(e);
        }
    }

    private static void logError(Exception excToAppend){
        try (BufferedWriter logger = new BufferedWriter(new FileWriter(FILE_PATH + "logs.txt"))) {
            logger.append(excToAppend.toString());
            logger.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private static void logError(String[] s, int line){
        try (BufferedWriter logger = new BufferedWriter(new FileWriter(FILE_PATH + "logs.txt", true))) {
            logger.append("Wrong Data have been given at line " + line + ":\n" + String.join(" ", s) + "\n\n");
            logger.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
