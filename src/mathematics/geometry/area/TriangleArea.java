package mathematics.geometry.area;

public class TriangleArea extends Area implements AreaCalculate {
    public TriangleArea(double a, double b, double e) {
        super(a, b, e);
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (this.getA() + this.getB() + this.getE()) / 2.0;
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.getA()) * (semiPerimeter - this.getB()) * (semiPerimeter - this.getE()));
    }

    public String toString() {
        return String.format("The area of triangle = %.2f", calculateArea());
    }
}
