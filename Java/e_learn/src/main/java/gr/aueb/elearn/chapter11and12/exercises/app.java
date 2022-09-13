package gr.aueb.elearn.chapter11and12.exercises;

import java.util.ArrayList;

/*
 * Driver class for @Vehicle class
 */
public class app {
    public static void main(String[] args) {
        ArrayList<Vehicle> myGarage = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myGarage.add(new Vehicle());
        }

        System.out.printf("Vehicle count: %d", Vehicle.getVehicleCount());

    }
}
