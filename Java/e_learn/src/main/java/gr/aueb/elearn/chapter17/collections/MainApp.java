package gr.aueb.elearn.chapter17.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Paris");
        List<Product> products = new ArrayList<>() {
            {
                add(new Product("Apples", 8.500, 10));
                add(new Product("Apples", 8.500, 8));
                add(new Product("Milk", 2.200, 4));
                add(new Product("Honey", 15.0, 2));
            }
        };

        List<Product> appleProducts = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());
        appleProducts.forEach(System.out::println);

        List<Double> priceProducts = products.stream()
                .map(Product::getPrice).collect(Collectors.toList());
        priceProducts.forEach(System.out::println);

        List<Product> honeyProducts = products.stream()
                .filter(product -> product.getDescription().equals("Honey"))
                .map(e -> new Product(e.getDescription(), e.getPrice() + e.getPrice() * 0.1, e.getQuantity()))
                .collect(Collectors.toList());
        honeyProducts.forEach(System.out::println);

        int applesCount = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .mapToInt(Product::getQuantity)
                .sum();
        System.out.println(applesCount);

        // Collections.sort(products);
        // products.forEach(System.out::println);

        // Collections.reverse(products);
        // products.forEach(System.out::println);

        // Collections.sort(products, Comparator.naturalOrder());
        // products.forEach(System.out::println);

        // Collections.sort(products, Comparator.reverseOrder());
        // products.forEach(System.out::println);

        // products.sort(Comparator
        // .comparing(Product::getDescription).reversed()
        // .thenComparingInt(Product::getQuantity)
        // .thenComparing(Product::getPrice, (a1, a2) -> Double.compare(a2, a1)));
        // products.stream().forEach(System.out::println);

        // products.stream().forEach(System.out::println);
        // System.out.println();

        // products.stream()
        // .filter((p) -> {
        // return p.getPrice() < 15.0;
        // })
        // .forEach(System.out::println);

        // cities.stream().forEach(city -> System.out.printf("\"%s\" ", city));
        // System.out.println();

        // Iterator<String> cities_it = cities.iterator();
        // while(cities_it.hasNext()){
        // System.out.println(cities_it.next());
        // }
    }
}
