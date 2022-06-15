package fr.diginamic.exercice2;

import java.time.LocalDate;
import java.util.Hashtable;

public class Mission {
    private final String nom;
    private final String description;
    private final int nbHeuresPrevues;
    private final Intervenant executant;
    private Hashtable<LocalDate, Integer> releveHoraire = new Hashtable<>();

    public Mission(String nom, String description, int nbHeuresPrevues, Intervenant executant) {
        this.nom = nom;
        this.description = description;
        this.nbHeuresPrevues = nbHeuresPrevues;
        this.executant = executant;
    }

    public Hashtable<LocalDate, Integer> getReleveHoraire() {
        return releveHoraire;
    }

    public Intervenant getExecutant() {
        return executant;
    }

    public void ajoutReleve(LocalDate laDate, int nbreHeures) {
        releveHoraire.put(laDate, nbreHeures);
    }

    public double nbHeuresEffectues() {
        double total = 0;
        for (LocalDate laDate : releveHoraire.keySet()) {
            total += releveHoraire.get(laDate);
        }
        return total;
    }
}
