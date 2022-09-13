package gr.aueb.elearn.chapter12;

public class InstanceOfDemo {
    private static final Point[] points;

    // Static initializer
    static {
        points = new Point[] {
                new Point(1),
                new Point2D(2, 3),
                new Point3D(5, 6, 7)
        };
    }

    public static void main(String[] args) {
        for (Point point : points) {

            if (point instanceof Point) {
                System.out.println(point.getClass().getSimpleName() + " " + point);
            }

            else if (point instanceof Point2D) {
                System.out.println(point.getClass().getSimpleName() + " " + point);
            }

            else if (point instanceof Point3D) {
                System.out.println(point.getClass().getSimpleName() + " " + point);
            }

        }

    }
}
