package mathematics.geometry.area;

public class SquareArea extends Area implements AreaCalculate {
    public SquareArea(double a) {
        super(a);
    }

    @Override
    public double calculateArea() {
        return this.getA() * this.getA();
    }

    public String toString() {
        return String.format("The area of square = %.2f", calculateArea());
    }
}
