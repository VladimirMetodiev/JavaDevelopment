package mathematics.geometry.point;

import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getPoint() {
        //int[] coordinates = {x, y};
        return new int[]{x, y};
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceBetweenTwoPoints(int x, int y) {
        return sqrt(pow(this.x - x, 2) + pow(this.y - y, 2));
    }

    @Override
    public String toString() {
        return String.format("Point[%d, %d]", x, y);
    }
}
