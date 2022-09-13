package gr.aueb.elearn.chapter13;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
public class Point2D extends Point {
    private double y;

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public void move(double x, double y) {
        super.move(x);
        this.y += y;
    }

    @Override
    protected void reset() {
        super.reset();
        this.y = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Point2D(y=" + this.y + ")";
    }

}
