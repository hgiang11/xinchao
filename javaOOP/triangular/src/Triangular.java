
public class Triangular {
    protected double a;
    protected double b;
    protected double c;

    public Triangular(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangular() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  double area () {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter () {
        return a + b + c ;
    }
    @Override
    public String toString() {
        return "Triangular{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

