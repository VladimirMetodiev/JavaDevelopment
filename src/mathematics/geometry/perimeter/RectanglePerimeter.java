package mathematics.geometry.perimeter;

public class RectanglePerimeter extends Perimeter implements PerimeterCalculate {
    public RectanglePerimeter(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * this.getA() + 2.0 * this.getB();
    }

    public String toString() {
        return String.format("The perimeter of rectangle = %.2f", calculatePerimeter());
    }
}
