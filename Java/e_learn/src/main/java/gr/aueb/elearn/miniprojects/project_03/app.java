package gr.aueb.elearn.miniprojects.project_03;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class app {

    private static final String PATH = "./src/main/java/gr/aueb/elearn/miniprojects/project_03/resources/";

    public static void main(String[] args) {
        String myCharacters = getCharacters();

        ArrayList<Map<Character, Integer>> sorted_by_value = charCountByVal(myCharacters);
        System.out.println("Sorted by values.");
        sorted_by_value.forEach(m -> System.out.println(m));
        
        System.out.println();

        ArrayList<Map<Character, Integer>> sorted_by_chars = charCountByChar(myCharacters);
        System.out.println("Sorted by ASCII values.");
        sorted_by_chars.forEach(m -> System.out.println(m));
    }

    private static ArrayList<Map<Character, Integer>> charCountByVal(String str) {
        ArrayList<Map<Character, Integer>> result = new ArrayList<>();
        Map<Character, Integer> data = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (data.containsKey(ch))
                data.put(ch, data.get(ch) + 1);
            else
                data.put(ch, 1);
        }

        while (!data.isEmpty()) {
            Character maxKey = data.keySet().stream().findFirst().get();
            for (Character key : data.keySet()) {
                if (data.get(key) > data.get(maxKey))
                    maxKey = key;
            }
            Map<Character, Integer> append = new HashMap<>();
            append.put(maxKey, data.get(maxKey));
            result.add(append);
            data.remove(maxKey);
        }

        return result;
    }

    private static ArrayList<Map<Character, Integer>> charCountByChar(String str) {
        ArrayList<Map<Character, Integer>> result = new ArrayList<>();
        Map<Character, Integer> data = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (data.containsKey(ch))
                data.put(ch, data.get(ch) + 1);
            else
                data.put(ch, 1);
        }

        while (!data.isEmpty()) {
            Character maxKey = data.keySet().stream().findFirst().get();
            for (Character key : data.keySet()) {
                if (key > maxKey)
                    maxKey = key;
            }
            Map<Character, Integer> append = new HashMap<>();
            append.put(maxKey, data.get(maxKey));
            result.add(append);
            data.remove(maxKey);
        }

        return result;
    }

    private static String getCharacters() {
        File raw_numbers = new File(PATH + "characters.txt");

        StringBuilder result = new StringBuilder();

        try (Scanner inpt = new Scanner(raw_numbers)) {
            while (inpt.hasNext()) {
                String str = inpt.next();
                result.append(str);
            }
            inpt.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return result.toString();
    }
}
