package fr.diginamic.mesMachines;

import java.time.LocalDate;

public class BassinADecanter extends Machine{
    private int capaciteHL;

    public BassinADecanter(LocalDate dateAchat, String marque, String modele, int capaciteHL) {
        super(dateAchat, marque, modele);
        this.capaciteHL = capaciteHL;
    }

    public int getCapaciteHL() {
        return capaciteHL;
    }

    public void setCapaciteHL(int capaciteHL) {
        this.capaciteHL = capaciteHL;
    }

    /**
     * {@inheritDoc} * @see mesMachines.Machine#toString()
     */
    @Override
    public String toString() {
        return "(" + capaciteHL + "HL) " + super.toString();
    }
}
