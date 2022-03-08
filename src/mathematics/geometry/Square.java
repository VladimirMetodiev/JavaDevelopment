package mathematics.geometry;

import mathematics.geometry.area.SquareArea;
import mathematics.geometry.perimeter.SquarePerimeter;

public class Square {
    SquareArea area;
    SquarePerimeter perimeter;

    public Square(double a) {
        area = new SquareArea(a);
        perimeter = new SquarePerimeter(a);
    }

    public double getArea() {
        return area.calculateArea();
    }

    public double getPerimeter() {
        return perimeter.calculatePerimeter();
    }
}
