package mathematics.stereometry;

import mathematics.stereometry.circle.Circle;

public class Cylinder extends Circle {
    protected double height = 0.0;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double calculateCylinderArea() {
        return calculateCircumference() * height + 2.0 * calculateArea();
    }

    public double calculateCylinderVolume() {
        return calculateArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder area = %.2f%nCylinder volume = %.2f%n", calculateCylinderArea(), calculateCylinderVolume());
    }
}
