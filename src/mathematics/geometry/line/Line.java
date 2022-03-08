package mathematics.geometry.line;

import mathematics.geometry.point.Point;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
    private Point a;
    private Point b;

    public Line() {
        a = new Point();
        b = new Point();
    }

    public Line(int x1, int y1, int x2, int y2) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
    }

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(int x1, int y1) {
        a.setX(x1);
        a.setY(y1);
    }

    public Point getB() {
        return b;
    }

    public void setB(int x2, int y2) {
        b.setX(x2);
        b.setY(y2);
    }

    public int[] getAPoint() {
        return a.getPoint();
    }

    public int[] getBPoint() {
        return b.getPoint();
    }

    public double getLength() {
        return sqrt(pow(a.getX() - b.getX(), 2) + pow(a.getY() - b.getY(), 2));
    }

    @Override
    public String toString() {
        return String.format("A line with beginning %s and end %s.", Arrays.toString(a.getPoint()), Arrays.toString(b.getPoint()));
    }
}
