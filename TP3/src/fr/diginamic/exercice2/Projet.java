package fr.diginamic.exercice2;

import java.time.LocalDate;
import java.util.List;

public class Projet {
    private final String nom;
    private final LocalDate debut;
    private final LocalDate fin;
    private final int prixFactureMO;
    private final List<Mission> missions;

    public Projet(String nom, LocalDate debut, LocalDate fin, int prixFactureMO, List<Mission> missions) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFactureMO = prixFactureMO;
        this.missions = missions;
    }

    public double cumulCoutMO() {
        double cumul = 0;
        for (Mission mission : missions) {
            cumul += mission.getExecutant().getTauxHoraire() * mission.nbHeuresEffectues();
        }
        return cumul;
    }

    public double margeBruteCourante() {
        return prixFactureMO - cumulCoutMO();
    }
}
