package mathematics.geometry.geometricObject;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements GeometricObject, Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getParameter() {
        return radius;
    }

    @Override
    public double getArea() {
        return pow(radius, 2) * PI;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * PI * radius;
    }

    @Override
    public void resize(int percent) {
        radius *= 1.0 + percent / 100.0;
    }
}
