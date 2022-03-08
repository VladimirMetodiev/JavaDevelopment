package mathematics.stereometry;

import mathematics.stereometry.circle.Circle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Cone extends Circle {
    protected double height = 0.0;

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double calculateConeArea() {
        return (calculateCircumference() * sqrt(pow(super.radius, 2) + pow(height, 2)) / 2.0) + calculateArea();
    }

    public double calculateConeVolume() {
        return calculateArea() * height / 3.0;
    }

    @Override
    public String toString() {
        return String.format("Cone area = %.2f%nCone volume = %.2f%n", calculateConeArea(), calculateConeVolume());
    }
}
