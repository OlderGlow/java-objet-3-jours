public class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    public double aire() {
        return cote * cote;
    }

    @Override
    double perimetre() {
        return 4 * cote;
    }

    @Override
    public String toString() {
        return super.toString() + "Carre de cote " + cote + " : aire = " + aire() + " et perimetre = " + perimetre();
    }
}
