package gr.aueb.elearn.chapter12.exercises.ex1;

public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public PointXYZ() {
    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static PointXYZ probableZero(int range) {
        return new PointXYZ(
                (int) (Math.random() * (range * 2)) - range,
                (int) (Math.random() * (range * 2)) - range,
                (int) (Math.random() * (range * 2)) - range);
    }

    @Override
    public String toString() {
        return "PointyXYZ(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
