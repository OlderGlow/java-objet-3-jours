package fr.diginamic.exercice5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanningJournee {
    private LocalDate date;
    private List<MiniExcursionPlanifiee> lesMiniExcursions = new ArrayList<>();

    public PlanningJournee(LocalDate laDate, List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
        // définit le constructeur avec les éléments passés en paramètres
        this.setDate(laDate);
        this.setLesMiniExcursionsPlanifiees(lesMiniExcursionsPlanifiees);
    }


    public LocalDate getDate() {
        // retourne la date de la classe
        return date;
    }

    public void setDate(LocalDate laDate) {
        // redéfinit la date
        this.date = laDate;
    }

    public List<MiniExcursionPlanifiee> getLesMiniExcursionsPlanifiees() {
        //  retourne les mini excursions planifiées
        return lesMiniExcursions;
    }

    public void setLesMiniExcursionsPlanifiees(List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
        //  redéfinit les mini excursions planifiées
        this.lesMiniExcursions = lesMiniExcursionsPlanifiees;
    }
}
