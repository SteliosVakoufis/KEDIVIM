package gr.aueb.elearn.chapter17.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("GR", "Greece");
        countries.put("FR", "France");
        countries.put("US", "USA");
        countries.put("IT", "Italy");

        countries.forEach((key, val) -> System.out.printf("%s -> %s\n", key, val));

        var it = countries.entrySet().iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
