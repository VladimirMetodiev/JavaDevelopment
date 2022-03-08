package mathematics.geometry;

import mathematics.geometry.area.TriangleArea;
import mathematics.geometry.perimeter.TrianglePerimeter;

public class Triangle {
    TriangleArea area;
    TrianglePerimeter perimeter;

    public Triangle(double a, double b, double e) {
        if(a + b <= e || a + e <= b || e + b <= a) throw new IllegalArgumentException("These aren't sides of a triangle.");
        area = new TriangleArea(a, b, e);
        perimeter = new TrianglePerimeter(a, b, e);
    }

    public double getArea() {
        return area.calculateArea();
    }

    public double getPerimeter() {
        return perimeter.calculatePerimeter();
    }
}
