package mathematics.stereometry;

import mathematics.stereometry.quadrangle.Square;

public class Cube extends Square {
    private double height = 0.0;

    public Cube(double length) {
        super(length);
        this.height = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return 6.0 * super.calculateArea();
    }

    public double calculateVolume() {
        return super.calculateArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Surface area of the cube = %.2f%nVolume of the cube = %.2f%n", calculateArea(), calculateVolume());
    }
}
