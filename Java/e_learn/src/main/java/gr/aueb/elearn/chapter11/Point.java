package gr.aueb.elearn.chapter11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Point {

    private int x;
    private int y;

    
    /** 
     * @param x
     * @param y
     */
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x: " + this.x + " y: " + this.y;
    }

    public static void main(String[] args) {
        Point p = new Point(10, 4);
        System.out.println(p.toString());

        p.move(10, 3);
        System.out.println(p.toString());
    }
}
