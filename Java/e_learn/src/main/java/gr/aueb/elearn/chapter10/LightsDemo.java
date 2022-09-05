package gr.aueb.elearn.chapter10;

import java.util.Scanner;

public class LightsDemo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int temp;
        Boolean isRaining = false;
        Boolean isSnowing = false;
        Boolean isNight = false;
        Boolean areLightsOn = false;

        System.out.println("Please insert temperature");
        temp = getValidInt();
        isNight = getValidBoolean();
        isRaining = getValidBoolean();

        isSnowing = temp < 0;
        areLightsOn = (isRaining || isSnowing) && isNight;

        System.out.printf("Lights are %s", areLightsOn ? "on" : "off");

    }

    private static int getValidInt() {
        Scanner inpt = new Scanner(System.in);

        while (true) {
            try {
                int num = inpt.nextInt();
                inpt.close();
                return num;
            } catch (Exception e) {
                System.out.println(e);
                inpt.nextLine();
            }
        }
    }

    private static Boolean getValidBoolean() {
        Scanner inpt = new Scanner(System.in);

        while (true) {
            try {
                Boolean num = inpt.nextBoolean();
                inpt.close();
                return num;
            } catch (Exception e) {
                System.out.println(e);
                inpt.nextLine();
            }
        }
    }

}
