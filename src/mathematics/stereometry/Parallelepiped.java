package mathematics.stereometry;

import mathematics.stereometry.quadrangle.Rectangle;

public class Parallelepiped extends Rectangle {
    private double height = 0.0;

    public Parallelepiped(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return 2.0 * super.getLength() * height + 2.0 * super.getWidth() * height + 2.0 * super.calculateArea();
    }

    public double calculateVolume() {
        return super.calculateArea() * height;
    }

    @Override
    public String toString() {
        return String.format("The parallelepiped area = %.2f%nThe parallelepiped volume = %.2f%n", calculateArea(), calculateVolume());
    }
}
