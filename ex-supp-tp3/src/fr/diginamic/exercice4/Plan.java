package fr.diginamic.exercice4;

import java.util.ArrayList;
import java.util.List;

public class Plan {
    private List<Emplacement> emplacements = new ArrayList<>();
    private int echelle;
    private String nomFichier;

    public List<Emplacement> getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(List<Emplacement> emplacements) {
        this.emplacements = emplacements;
    }

    public int getEchelle() {
        return echelle;
    }

    public void setEchelle(int echelle) {
        this.echelle = echelle;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public Plan(String nomFichier) {
        this.setNomFichier(nomFichier);
    }

    public void ajouteEmplacement(Emplacement emplacement) {
        this.emplacements.add(emplacement);
    }

    public void supprimeEmplacement(Emplacement emplacement) {
        this.emplacements.remove(emplacement);
    }

    public String affiche() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plan : ");
        sb.append("Nom fichier : ").append(this.getNomFichier()).append(" ");
        sb.append("Echelle : ").append(this.getEchelle()).append(" ");
        sb.append("Emplacements : ");
        for (Emplacement emplacement : this.getEmplacements()) {
            sb.append(emplacement.affiche()).append(" ");
        }
        return sb.toString();
    }
}
