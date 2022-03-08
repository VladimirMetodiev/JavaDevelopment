package mathematics.geometry.area;

public class RectangleArea extends Area implements AreaCalculate {
    public RectangleArea(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculateArea() {
        return this.getA() * this.getB();
    }

    public String toString() {
        return String.format("The area of rectangle = %.2f", calculateArea());
    }
}
