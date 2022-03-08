package mathematics.geometry.area;

public class IsoscelesTrapezoidArea extends Area implements AreaCalculate {
    public IsoscelesTrapezoidArea(double a, double b, double h) {
        super(a, b, h);
    }

    @Override
    public double calculateArea() {
        return (this.getA() + this.getB()) * this.getE() / 2.0;
    }

    public String toString() {
        return String.format("The area of isosceles trapezoid = %.2f", calculateArea());
    }
}
