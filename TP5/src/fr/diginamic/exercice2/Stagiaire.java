package fr.diginamic.exercice2;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Stagiaire {
    private String nom;
    private String prenom;
    private List<Matiere> matieres;

    public Stagiaire(String nom, String prenom, List<Matiere> matieres) {
        this.nom = nom;
        this.prenom = prenom;
        this.matieres = matieres;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stagiaire : ");
        sb.append(nom.toUpperCase());
        sb.append(" ");
        sb.append(prenom);
        sb.append("\n");
        sb.append("\n");
        sb.append("Matières :");
        sb.append(matieres);
        return sb.toString();
    }

}
