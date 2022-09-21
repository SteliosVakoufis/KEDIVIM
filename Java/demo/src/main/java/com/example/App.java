package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();

        myArrayList.add("Hello there");
        myArrayList.add("Hello there");
        myArrayList.add("Hello there");
        myArrayList.add("Hello there");

        IFunctionalInterface func = (String s) -> s + " Hello";

        myArrayList.forEach(s -> myFunc(s));
        myArrayList = myArrayList.stream().map(s -> func.myFunc(s)).collect(Collectors.toList());
        myArrayList.forEach(s -> myFunc(s));

        System.out.println();
        myArrayList.forEach(App::myFunc);

        System.out.println();
        MyClass mc = new MyClass();
    }

    private static void myFunc(String s) {
        System.out.println(s);
    }

}
