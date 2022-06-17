public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double aire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public String toString() {
        return super.toString() + "Cercle de rayon " + rayon;
    }
}
