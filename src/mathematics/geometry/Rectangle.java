package mathematics.geometry;

import mathematics.geometry.area.RectangleArea;
import mathematics.geometry.perimeter.RectanglePerimeter;

public class Rectangle {
    RectangleArea area;
    RectanglePerimeter perimeter;

    public Rectangle(double a, double b) {
        area = new RectangleArea(a, b);
        perimeter = new RectanglePerimeter(a, b);
    }

    public double getArea() {
        return area.calculateArea();
    }

    public double getPerimeter() {
        return perimeter.calculatePerimeter();
    }
}
