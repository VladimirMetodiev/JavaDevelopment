package mathematics.stereometry;

import mathematics.stereometry.circle.Circle;

public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double calculateSphereArea() {
        return 4.0 * calculateArea();
    }

    public double calculateSphereVolume() {
        return  calculateArea() * super.radius * 4.0 / 3.0;
    }

    @Override
    public String toString() {
        return String.format("Surface area of the sphere = %.2f%nVolume of the sphere = %.2f%n", calculateSphereArea(), calculateSphereVolume());
    }
}
