package fr.diginamic.exercice5;

import java.time.LocalTime;
import java.util.List;

public class MiniExcursion {
    private int numMiniExcursion = 0;
    private String libelleMiniExcursion;
    private int nombrePlaces;
    private List<Etape> lesEtapes;

    public MiniExcursion(String libelleMiniExcursion, int nombrePlaces, List<Etape> lesEtapes) {
        this.setLibelleMiniExcursion(libelleMiniExcursion);
        this.setNombrePlaces(nombrePlaces);
        this.setLesEtapes(lesEtapes);
        this.setNumMiniExcursion(this.getNumMiniExcursion()+1);
    }

    public List<Etape> getLesEtapes() {
        return lesEtapes;
    }

    public void setLesEtapes(List<Etape> lesEtapes) {
        this.lesEtapes = lesEtapes;
    }

    public int getNumMiniExcursion() {
        return numMiniExcursion;
    }

    public void setNumMiniExcursion(int numMiniExcursion) {
        this.numMiniExcursion = numMiniExcursion;
    }

    public String getLibelleMiniExcursion() {
        return libelleMiniExcursion;
    }

    public void setLibelleMiniExcursion(String libelleMiniExcursion) {
        this.libelleMiniExcursion = libelleMiniExcursion;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public LocalTime donneDureePrevueHHMM() {
        int duree = 0;
        for (Etape etape : lesEtapes) {
            duree += etape.getDureePrevue();
        }
        return LocalTime.ofSecondOfDay(duree * 60L);
    }

}
