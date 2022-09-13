package gr.aueb.elearn.chapter11and12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@ToString
public class Circle {
    private Point center;
    private int radius;

    public void move(int x, int y) {
        this.center.move(x, y);
    }

    public Point getCenter() {
        return new Point(this.center.getX(), this.center.getY());
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(Point.getRandomPoint(100), 10);

        System.out.println(myCircle);

    }

}
