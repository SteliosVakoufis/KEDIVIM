package gr.aueb.elearn.chapter14.exercises.ex1;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return this.width * this.height;
    }

}
