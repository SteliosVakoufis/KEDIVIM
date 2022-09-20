package gr.aueb.elearn.chapter14.ishapes2;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return this.width * this.height;
    }

}
