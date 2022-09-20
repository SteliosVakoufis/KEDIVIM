package gr.aueb.elearn.chapter14.exercises.ex2;

public class Rectangle extends AbstractShape implements IRectangle {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * (this.width + this.height));
    }

}
