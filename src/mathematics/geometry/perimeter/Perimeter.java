package mathematics.geometry.perimeter;

public class Perimeter {
    private double a = 0.0;
    private double b = 0.0;
    private double e = 0.0;
    private double f = 0.0;

    public Perimeter(double a) {
        this.setA(a);
    }

    public Perimeter(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    public Perimeter(double a, double b, double e) {
        this.setA(a);
        this.setB(b);
        this.setE(e);
    }

    public Perimeter(double a, double b, double e, double f) {
        this.setA(a);
        this.setB(b);
        this.setE(e);
        this.setF(f);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a <= 0) throw new IllegalArgumentException("It can not be negative or zero.");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b <= 0) throw new IllegalArgumentException("Any side can not be negative or zero.");
        this.b = b;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        if(e <= 0) throw new IllegalArgumentException("Any side can not be negative or zero.");
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        if(f <= 0) throw new IllegalArgumentException("Any side can not be negative or zero.");
        this.f = f;
    }
}
