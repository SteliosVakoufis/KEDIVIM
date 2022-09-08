package gr.aueb.elearn.chapter11.exercises;

import java.io.Serializable;

/*
 * This is a java Bean..
 */
public class Vehicle implements Serializable{
    
    private static int vehicle_count;
    
    private String type;
    private String releaseYear;
    private int cubicCapacity;
    private boolean longVehicle;

    public Vehicle() {
        vehicle_count++;
    }

    public static int getVehicleCount(){
        return vehicle_count;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getCubicCapacity() {
        return this.cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public boolean isLongVehicle() {
        return this.longVehicle;
    }

    public boolean getLongVehicle() {
        return this.longVehicle;
    }

    public void setLongVehicle(boolean longVehicle) {
        this.longVehicle = longVehicle;
    }

}
