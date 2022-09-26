package com.example.test1;

public class app {
    public static void main(String[] args) {
        Class1 myclass = new Class2();

        System.out.println(myclass.getClass().getSimpleName());

        myclass.print();
    }
}
