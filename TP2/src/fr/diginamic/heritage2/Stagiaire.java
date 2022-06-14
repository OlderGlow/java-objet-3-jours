package fr.diginamic.heritage2;

import java.time.LocalDate;

public class Stagiaire extends Individu {
    private LocalDate dateNaissance;
    private String adresse;
    private String codePostal;
    private String ville;

    public Stagiaire(String nom, String prenom, int telephone, LocalDate dateNaissance, String adresse, String codePostal, String ville) {
        super(nom, prenom, telephone);
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
