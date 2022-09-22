package com.example;

public class MyClass {

    public static class MyClass2 {
        enum myEnum {
            CONTROLLER,
            MENU
        }

        public static void main(String[] args) {
            System.out.println(myEnum.CONTROLLER.ordinal());
        }
    }

}
