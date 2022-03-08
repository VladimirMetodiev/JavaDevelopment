package mathematics.geometry;

import mathematics.geometry.area.CircleArea;
import mathematics.geometry.perimeter.CirclePerimeter;

public class Circle {
    CircleArea area;
    CirclePerimeter perimeter;

    public Circle(double a) {
        area = new CircleArea(a);
        perimeter = new CirclePerimeter(a);
    }

    public double getArea() {
        return area.calculateArea();
    }

    public double getPerimeter() {
        return perimeter.calculatePerimeter();
    }
}
