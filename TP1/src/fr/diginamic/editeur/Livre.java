package fr.diginamic.editeur;

import java.time.LocalDate;

public class Livre {
    private String titre;
    private String auteur;
    private float prix;
    private int nbPages;
    private long isbn;
    private LocalDate anneeParution;

    public Livre() {
    }

    public Livre(String titre, int nbPages, long isbn) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int nbPages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, float prix, int nbPages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, float prix, int nbPages, long isbn, LocalDate anneeParution) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.anneeParution = anneeParution;
    }

    public Livre(Livre livre) {
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.prix = livre.prix;
        this.nbPages = livre.nbPages;
        this.isbn = livre.isbn;
        this.anneeParution = livre.anneeParution;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public LocalDate getAnneeParution() {
        return anneeParution;
    }

    public void setAnneeParution(LocalDate anneeParution) {
        this.anneeParution = anneeParution;
    }

    @Override
    public String toString() {
        return "fr.diginamic.editeur.Livre{" + "titre='" + titre + '\'' + ", auteur='" + auteur + '\'' + ", prix=" + prix + ", nbPages=" + nbPages + ", isbn=" + isbn + ", anneeParution=" + anneeParution + '}';
    }
}
