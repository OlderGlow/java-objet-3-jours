package fr.diginamic.exercice4;

import java.awt.*;

public abstract class Emplacement {
    private int dimension;
    private int couleur;
    private int xCentre;
    private int yCentre;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public int getxCentre() {
        return xCentre;
    }

    public void setxCentre(int xCentre) {
        this.xCentre = xCentre;
    }

    public int getyCentre() {
        return yCentre;
    }

    public void setyCentre(int yCentre) {
        this.yCentre = yCentre;
    }

    protected Emplacement(int couleur, int xCentre, int yCentre){
        this.setCouleur(couleur);
        this.setxCentre(xCentre);
        this.setyCentre(yCentre);
    }

    abstract String affiche();
}
