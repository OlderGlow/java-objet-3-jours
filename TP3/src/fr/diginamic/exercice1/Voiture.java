package fr.diginamic.exercice1;

import java.awt.*;

public class Voiture {
    private int numSerie;
    private String immatriculation;
    private String marque;
    private Color couleur;
    private int annee;
    private Individu proprietaire;

    public Voiture(int numSerie, String immatriculation, String marque, Color couleur, int annee) {
        this.numSerie = numSerie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Individu getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "La voiture " + numSerie + " " + immatriculation + " " + marque + " " + couleur + " " + annee + " " + proprietaire;
    }

    public static void klaxonner() {
        System.out.println("Pouet pouet");
    }

    public static void conduire() {
        System.out.println("Je conduit");
    }

    public static void demarrer() {
        System.out.println("Je démarre");
    }

    public static void arreter() {
        System.out.println("Je stop");
    }


}
