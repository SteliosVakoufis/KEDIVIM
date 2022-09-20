package gr.aueb.elearn.chapter14.ishapes2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Line extends AbstractShape {
    private Point point1;
    private Point point2;



    public Line(Point point1, Point point2) {
        this.point1 = new Point(point1);
        this.point2 = new Point(point2);
    }

    public Point getPoint1() {
        return new Point(this.point1);
    }

    public Point getPoint2() {
        return new Point(this.point2);
    }
    
}
