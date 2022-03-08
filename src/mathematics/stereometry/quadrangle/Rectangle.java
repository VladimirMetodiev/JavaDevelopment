package mathematics.stereometry.quadrangle;

public class Rectangle extends Quadrangle {
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double calculateArea() {
        return getLength() * getWidth();
    }
}
