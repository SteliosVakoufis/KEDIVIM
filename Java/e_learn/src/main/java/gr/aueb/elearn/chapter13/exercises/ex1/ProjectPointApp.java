package gr.aueb.elearn.chapter13.exercises.ex1;

import java.util.ArrayList;

public class ProjectPointApp {
    public static void main(String[] args) {
        ArrayList<PointXYZ> myPoints = new ArrayList<>();
        final int SIZE = 10;

        for (int i = 0; i < SIZE; i++) {
            myPoints.add(PointXYZ.probableZero(100));
        }

        for (PointXYZ point : myPoints) {
            System.out.println(point);
        }

    }
}
