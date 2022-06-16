package fr.diginamic.exercice5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MiniExcursionPlanifiee {
    private LocalDateTime heureDepart;
    private int nombreInscrits;
    private MiniExcursion laMiniExcursion;

    public MiniExcursionPlanifiee(LocalDate now, int nombreInscrits, MiniExcursionPayante maMiniExcPay) {
        this.setHeureDepart(LocalDateTime.of(now, LocalTime.of(8, 0)));
        this.setNombreInscrits(nombreInscrits);
        this.setLesMiniExcursions(maMiniExcPay);
    }

    public MiniExcursionPlanifiee(LocalDate now, int nombreInscrits, MiniExcursion maMiniExc) {
        this.setHeureDepart(LocalDateTime.of(now, LocalTime.of(8, 0)));
        this.setNombreInscrits(nombreInscrits);
        this.setLesMiniExcursions(maMiniExc);
    }

    public MiniExcursionPlanifiee(String heureDepart, int nombreInscrits, MiniExcursion maMiniExc) {
        // on récupère l'heure de départ au format HH:MM exemple 8h15 = 08:15
        String[] tabHeureDepart = heureDepart.split("h");
        int heure = Integer.parseInt(tabHeureDepart[0]);
        int minute = Integer.parseInt(tabHeureDepart[1]);
        this.setHeureDepart(LocalDateTime.of(LocalDate.now(), LocalTime.of(heure, minute)));
        this.setNombreInscrits(nombreInscrits);
        this.setLesMiniExcursions(maMiniExc);
    }

    public boolean estComplete() {
        return nombreInscrits == laMiniExcursion.getNombrePlaces();
    }

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalDateTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public int getNombreInscrits() {
        return nombreInscrits;
    }

    public void setNombreInscrits(int nombreInscrits) {
        this.nombreInscrits = nombreInscrits;
    }


    public void setLesMiniExcursions(MiniExcursion maMiniExc) {
        this.laMiniExcursion = maMiniExc;
    }

    public MiniExcursion getLaminiExcursion() {
        return laMiniExcursion;
    }

}
