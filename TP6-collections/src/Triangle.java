public class Triangle extends Forme {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double aire() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double perimetre() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle de cotes " + a + ", " + b + " et " + c + " : aire = " + aire() + " et perimetre = " + perimetre();
    }
}
