package fr.diginamic.exercice1;

public class NombreAleatoire {
    private final int nombre;

    public NombreAleatoire(int min, int max) {
        this.nombre = (int) (Math.random() * (max - min + 1)) + min;
    }

    public int getNombre() {
        return nombre;
    }
}
