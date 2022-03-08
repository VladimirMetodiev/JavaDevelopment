package mathematics.stereometry.quadrangle;

public class Square extends Quadrangle {
    public Square() {
    }

    public Square(double length) {
        super(length);
    }

    public double calculateArea() {
        return getLength() * getLength();
    }
}
