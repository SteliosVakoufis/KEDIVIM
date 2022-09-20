package gr.aueb.elearn.chapter14.exercises.ex2;

public class Circle extends AbstractShape implements ICircle {
    private double radius;

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * Math.PI * radius);
    }

    @Override
    public double getDiamter() {
        return this.radius * 2;
    }

}
