package fr.diginamic.exercice2;

public class Intervenant {
    private String nom;
    private double tauxHoraire;

    public Intervenant(String nom, double tauxHoraire) {
        this.nom = nom;
        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }
}
