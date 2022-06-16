package fr.diginamic.exercice5;

import java.util.List;

public class MiniExcursionPayante extends MiniExcursion {
    private float tarif;

    public MiniExcursionPayante(String libelleMiniExcursion, int nombrePlaces, List<Etape> lesEtapes, float tarif) {
        super(libelleMiniExcursion, nombrePlaces, lesEtapes);
        this.setTarif(tarif);
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
