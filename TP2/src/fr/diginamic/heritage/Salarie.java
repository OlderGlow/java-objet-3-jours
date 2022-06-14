package fr.diginamic.heritage;

public class Salarie extends Individu {
    private double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Salarie{" +
                "salaire=" + salaire +
                "€/mois}";
    }
}
