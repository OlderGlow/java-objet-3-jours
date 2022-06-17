public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double aire() {
        return largeur * hauteur;
    }

    @Override
    double perimetre() {
        return 2 * (largeur + hauteur);
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle de largeur " + largeur + " et hauteur " + hauteur;
    }
}
