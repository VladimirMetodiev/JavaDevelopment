package mathematics.stereometry.quadrangle;

public abstract class Quadrangle {
    private double length = 0.0;
    private double width = 0.0;

    public Quadrangle() {
    }

    public Quadrangle(double length) {
        this.length = length;
        this.width = length;
    }

    public Quadrangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double calculateArea();
}
