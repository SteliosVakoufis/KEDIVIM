package gr.aueb.elearn.chapter16.lambdas_and_runnable;

import java.util.ArrayList;

public class KnightApp {
    public static void main(String[] args) {
        Runnable joe = new Knight("Joe the Destroyer");
        Runnable jackall = new Knight("Jackall the Ackall");
        Runnable johnCena = new Knight("John of the Cena");

        (new Thread(joe)).start();
        (new Thread(jackall)).start();
        (new Thread(johnCena)).start();

        // joe.embarkOnMission(
        //     new IMission() {
        //         @Override
        //         public void embark(){
        //             System.out.println("Save the princess!");
        //         }
        //     }
        // );

        // ArrayList<IMission> missions = new ArrayList<>();


        // jackall.embarkOnMission(mission1);

        // missions.forEach(joe::embarkOnMission);
    }

    public static void saveThePrincess() {
        System.out.println("Save the princess!");
    }

    public static void killThePrincess() {
        System.out.println("Kill the princess!");
    }
}
