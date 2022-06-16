package fr.diginamic.exercice5;

import java.time.LocalTime;

public class Etape {
    private int dureePrevue;
    private int numEtape;
    private String description;

    public Etape(String description, int dureePrevue) {
        this.setDescriptionPrevue(description);
        this.setDureePrevue(dureePrevue);
        this.numEtape = this.numEtape + 1;
    }

    public String getDescriptionPrevue() {
        return description;
    }

    public void setDescriptionPrevue(String descriptionPrevue) {
        this.description = descriptionPrevue;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public LocalTime donneDureePrevueHHMM() {
        return LocalTime.ofSecondOfDay(dureePrevue * 60L);
    }


}
