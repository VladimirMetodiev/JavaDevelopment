package mathematics.geometry;

import mathematics.geometry.area.IsoscelesTrapezoidArea;
import mathematics.geometry.perimeter.IsoscelesTrapezoidPerimeter;

import static java.lang.Math.*;

public class IsoscelesTrapezoid {
    IsoscelesTrapezoidArea area;
    IsoscelesTrapezoidPerimeter perimeter;

    public IsoscelesTrapezoid(double a, double b, double e) {
        double h = sqrt(pow(e, 2) - pow((a - b) / 2.0, 2));
        area = new IsoscelesTrapezoidArea(a, b, h);
        perimeter = new IsoscelesTrapezoidPerimeter(a, b, e, e);
    }

    public double getArea() {
        return area.calculateArea();
    }

    public double getPerimeter() {
        return perimeter.calculatePerimeter();
    }
}
