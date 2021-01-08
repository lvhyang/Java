package ninepointten;

public class QuadraticEquation {
	private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        double d = b * b - 4 * a * c;
        return d;
    }
    public double getRoot1() {
        if (getDiscriminant() < 0)
            return 0;
        else {
            double m = (-b + Math.sqrt(getDiscriminant())) / 2 * a;
            return m;
        }
    }
        public double getRoot2 () {
            if (getDiscriminant() < 0)
                return 0;
            else {
                double n = (-b - Math.sqrt(getDiscriminant())) / 2 * a;
                return n;
            }
        }
}
