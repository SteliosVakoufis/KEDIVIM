package gr.aueb.elearn.chapter12;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point p2 = new Point2D(2, 3);
        Point p3 = new Point3D(4, 5, 6);

        System.out.println(p1);
        p1.move(10);
        System.out.println(p1);
        System.out.println();

        System.out.println(p2);
        ((Point2D) p2).move(10, 10);
        System.out.println(p2);
        System.out.println();

        System.out.println(p3);
        ((Point3D)p3).move(10, 10, 10);
        System.out.println(p3);
        System.out.println();

        makeReset(p1);
        makeReset(p2);
        makeReset(p3);

        printPoint(p1);
        printPoint(p2);
        printPoint(p3);
    }

    private static void makeReset(Point point) {
        point.reset();
    }

    private static void printPoint(Point point) {
        System.out.println(point);
    }

}
