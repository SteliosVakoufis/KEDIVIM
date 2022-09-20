package gr.aueb.elearn.chapter14.exercises.ex1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Circle extends AbstractShape implements ITwoDimensional {
    private double radius;
    private Point point;

    public Circle(Point point, double radius) {
        this.radius = radius;
        this.point = new Point(point);
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public Point getPoint() {
        return new Point(this.point);
    }
}
