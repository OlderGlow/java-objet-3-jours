package fr.diginamic.mesMachines;

import java.time.LocalDate;

public class PompeAGravitation extends Machine {
    private int debit;
    private boolean eauOperationnelle;

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int debit, boolean eauOperationnelle) {
        super(dateAchat, marque, modele);
        this.debit = debit;
        this.eauOperationnelle = eauOperationnelle;
    }

    /**
     * {@inheritDoc} * @see mesMachines.Machine#toString()
     */
    @Override
    public String toString() {
        return "(Débit: " + debit + " - Eau Opérationnelle :" + (eauOperationnelle ? "oui" : "non")  + " )" + super.toString();
    }
}
