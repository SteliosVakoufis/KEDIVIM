package gr.aueb.elearn.chapter10;

import java.util.HashMap;
import java.util.Map;

public class ProductsDemo {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Eggs", 12);
        myMap.put("Potatoes", 10);
        myMap.put("Letuce", 3);
        myMap.put("Onions", 10);
        if (!myMap.containsKey("Potatoes"))
            myMap.put("Potatoes", 10);

        System.out.println(myMap.toString());

    }
}
