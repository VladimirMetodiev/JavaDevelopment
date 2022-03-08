package mathematics.geometry.perimeter;

public class IsoscelesTrapezoidPerimeter extends Perimeter implements PerimeterCalculate {
    public IsoscelesTrapezoidPerimeter(double a, double b, double e, double f) {
        super(a, b, e, f);
    }

    @Override
    public double calculatePerimeter() {
        return this.getA() + this.getB() + this.getE() + this.getF();
    }

    public String toString() {
        return String.format("The perimeter of isosceles trapezoid = %.2f", calculatePerimeter());
    }
}
