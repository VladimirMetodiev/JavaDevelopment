package mathematics.geometry.perimeter;

public class TrianglePerimeter extends Perimeter implements PerimeterCalculate {
    public TrianglePerimeter(double a, double b, double e) {
        super(a, b, e);
    }

    @Override
    public double calculatePerimeter() {
        return this.getA() + this.getB() + this.getE();
    }

    public String toString() {
        return String.format("The perimeter of triangle = %.2f", calculatePerimeter());
    }
}
