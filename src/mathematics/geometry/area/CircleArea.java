package mathematics.geometry.area;

import static java.lang.Math.PI;

public class CircleArea extends Area implements AreaCalculate {
    public CircleArea(double r) {
        super(r);
    }

    @Override
    public double calculateArea() {
        return this.getA() * this.getA() * PI;
    }

    public String toString() {
        return String.format("The area of circle = %.2f", calculateArea());
    }
}
