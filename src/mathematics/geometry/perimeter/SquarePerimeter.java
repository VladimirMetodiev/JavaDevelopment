package mathematics.geometry.perimeter;

public class SquarePerimeter extends Perimeter implements PerimeterCalculate {
    public SquarePerimeter(double a) { super(a); }

    @Override
    public double calculatePerimeter() {
        return this.getA() * 4.0;
    }

    public String toString() {
        return String.format("The perimeter of square = %.2f", calculatePerimeter());
    }
}
