package fr.diginamic.exercice1;

import java.util.Scanner;

public class Partie {

    private final Scanner scanner = new Scanner(System.in);
    private int nbCoupsAutorises = 10;
    private int difficulte;
    private boolean partieTerminee = false;

    public void demarrerPartie() {
        this.menu();
        this.jouer();
    }

    public void jouer() {
        switch (this.getDifficulte()) {
            case 1 -> this.modeFacile();
            case 2 -> this.modeMoyen();
            case 3 -> this.modeDifficile();
            default -> System.out.println("Veuillez choisir une difficulté entre 1 et 3.");
        }
    }

    private void modeFacile() {
        NombreAleatoire nombreAleatoire = new NombreAleatoire(1, 100);
        logicGame(nombreAleatoire);
    }

    private void modeMoyen() {
        NombreAleatoire nombreAleatoire = new NombreAleatoire(1, 1000);
        logicGame(nombreAleatoire);
    }

    private void modeDifficile() {
        NombreAleatoire nombreAleatoire = new NombreAleatoire(1, 1000);
        do {
            System.out.println("Quel est le nombre ?");
            int nombre = scanner.nextInt();
            if (nombre == nombreAleatoire.getNombre()) {
                System.out.println("Bravo, vous avez trouvé le nombre !");
                this.setPartieTerminee(true);
                this.restartGame();
            } else {
                System.out.println("Mauvais numéro, veuillez recommencer.");
            }
            nbCoupsAutorises--;
        } while (!partieTerminee && nbCoupsAutorises > 0);
        if (this.getNbCoupsAutorises() == 0) {
            System.out.println("Vous avez perdu !");
        }
    }

    private void logicGame(NombreAleatoire nombreAleatoire) {
        do {
            System.out.println("Quel est le nombre ?");
            int nombre = scanner.nextInt();
            if (nombre == nombreAleatoire.getNombre()) {
                System.out.println("Bravo, vous avez trouvé le nombre !");
                this.setPartieTerminee(true);
                this.restartGame();
            } else if (nombre > nombreAleatoire.getNombre()) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("C'est plus !");
            }
            nbCoupsAutorises--;
        } while (!this.isPartieTerminee() && this.getNbCoupsAutorises() > 0);
        if (this.getNbCoupsAutorises() == 0) {
            System.out.println("Vous avez perdu !");
        }
    }

    private void restartGame() {
        System.out.println("Souhaitez-vous rejouer ? (o/n)");
        String reponse = scanner.next();
        if (reponse.equals("o")) {
            this.setPartieTerminee(false);
            this.setNbCoupsAutorises(10);
            this.jouer();
        } else {
            System.out.println("Au revoir !");
            scanner.close();
        }
    }

    private void menu(){
        System.out.println("Bienvenue dans le jeu du plus ou moins !");
        System.out.println("Vous devez trouver un nombre entre 1 et 100.");
        System.out.println("Vous avez 10 coups pour trouver le nombre.");
        System.out.println("Choississez votre difficulté :");
        System.out.println("1 - Facile");
        System.out.println("2 - Moyen");
        System.out.println("3 - Difficile");
        this.setDifficulte(scanner.nextInt());
    }

    public boolean isPartieTerminee() {
        return partieTerminee;
    }

    public void setPartieTerminee(boolean partieTerminee) {
        this.partieTerminee = partieTerminee;
    }

    public int getNbCoupsAutorises() {
        return nbCoupsAutorises;
    }

    public void setNbCoupsAutorises(int nbCoupsAutorises) {
        this.nbCoupsAutorises = nbCoupsAutorises;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }
}
