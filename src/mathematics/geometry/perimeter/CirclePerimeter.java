package mathematics.geometry.perimeter;

import static java.lang.Math.PI;

public class CirclePerimeter extends Perimeter implements PerimeterCalculate {
    public CirclePerimeter(double r) {
        super(r);
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * this.getA() * PI;
    }

    public String toString() {
        return String.format("The perimeter of circle = %.2f", calculatePerimeter());
    }
}
