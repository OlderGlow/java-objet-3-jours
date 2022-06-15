package fr.diginamic.heritage2;

import java.time.LocalDate;

public class Formateur extends Individu {
    private int numeroIntervenant;
    private LocalDate dateDeCreation;
    private static int nombreIntervenant = 0;

    public Formateur(String nom, String prenom, int telephone, LocalDate dateDeCreation) {
        super(nom, prenom, telephone);
        setNumeroIntervenant(getNumeroIntervenant() + 1);
        this.dateDeCreation = dateDeCreation;
        setNombreIntervenant(getNombreIntervenant() + 1);
    }

    public static int getNombreIntervenant() {
        return nombreIntervenant;
    }

    public static void setNombreIntervenant(int nombreIntervenant) {
        Formateur.nombreIntervenant = nombreIntervenant;
    }

    public int getNumeroIntervenant() {
        return numeroIntervenant;
    }

    public void setNumeroIntervenant(int numeroIntervenant) {
        this.numeroIntervenant = numeroIntervenant;
    }

    public LocalDate getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(LocalDate dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

}
