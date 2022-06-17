public class Triangle extends Forme {
    private double base;
    private double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public double aire() {
        return (base * hauteur) / 2;
    }

    @Override
    double perimetre() {
        return base + hauteur + Math.sqrt(base * base + hauteur * hauteur);
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle de base " + base + " et hauteur " + hauteur;
    }
}
