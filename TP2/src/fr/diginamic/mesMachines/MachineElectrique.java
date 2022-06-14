package fr.diginamic.mesMachines;

import java.time.LocalDate;

public class MachineElectrique extends Machine {
    private int puissanceW;

    public MachineElectrique(LocalDate dateAchat, String marque, String modele, int puissanceW) {
        super(dateAchat, marque, modele);
        this.puissanceW = puissanceW;
    }

    /**
     * {@inheritDoc} * @see mesMachines.Machine#toString()
     */
    @Override
    public String toString() {
        return "(" + puissanceW + "W) " + super.toString();
    }
}
