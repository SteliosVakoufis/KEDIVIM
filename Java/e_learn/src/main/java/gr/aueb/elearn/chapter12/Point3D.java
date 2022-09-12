package gr.aueb.elearn.chapter12;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Point3D extends Point2D {
    private double z;

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void move(double x, double y, double z) {
        super.move(x, y);
        this.z += z;
    }

    @Override
    protected void reset() {
        super.reset();
        this.z = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Point3D(z=" + this.z + ")";
    }

}
