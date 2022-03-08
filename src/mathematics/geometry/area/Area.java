package mathematics.geometry.area;

public class Area {
    private double a = 0.0;
    private double b = 0.0;
    private double e = 0.0;

    public Area(double a) {
        this.setA(a);
    }

    public Area(double a, double b) {
        this(a);
        this.setB(b);
    }

    public Area(double a, double b, double e) {
        this(a, b);
        this.setE(e);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a <= 0) throw new IllegalArgumentException("It can't be negative or zero.");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b <= 0) throw new IllegalArgumentException("It can't be negative or zero.");
        this.b = b;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        if(e <= 0) throw new IllegalArgumentException("It can't be negative or zero.");
        this.e = e;
    }
}
