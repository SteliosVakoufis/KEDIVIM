package gr.aueb.elearn.chapter14.exercises.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Point {
    private double x;
    private double y;

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }
}
