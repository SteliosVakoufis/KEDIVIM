package gr.aueb.elearn.chapter11and12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Point {

    private int x;
    private int y;
    
    Point(){}

    public static Point getZeroPoint() {
        return new Point();
    }
    
    public static Point getRandomPoint(int range) {
        return new Point((int)(Math.random() * range), (int)(Math.random() * range));
    }

    /** 
     * Moves the point to a new possition.
     * 
     * @param x is added to this.x
     * @param y is added to this.y
     */
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public static void main(String[] args) {
        Point p = new Point(10, 4);
        System.out.println(p);

        p.move(10, 3);
        System.out.println(p);
    }
}
