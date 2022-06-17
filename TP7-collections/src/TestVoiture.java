import java.awt.*;
import java.util.*;
import java.util.List;

public class TestVoiture {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Voiture> voitures = new ArrayList<>();

    public static void main(String[] args) {
        int choix;
        do {
            afficherMenu();
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1 -> ajouterVoiture();
                case 2 -> afficherVoitures();
                case 3 -> {
                    try {
                        modifierVoiture();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        supprimerVoiture();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
                case 5 -> ajouterProprietaire();
                case 7 -> listerVoitureParCritere();
                case 8 -> System.out.println("Au revoir !");
            }
        } while (choix != 8);
    }

    public static void afficherMenu() {
        System.out.println("1 - Ajouter une voiture");
        System.out.println("2 - Lister les voitures");
        System.out.println("3 - Modifier une voiture");
        System.out.println("4 - Supprimer une voiture");
        System.out.println("5 - Ajouter un propriétaire à une voiture");
        System.out.println("7 - Lister les voitures par critère");
        System.out.println("8 - Quitter");
    }

    public static void afficherVoitures() {
        if (voitures.isEmpty()) {
            System.err.println("Aucune voiture n'est enregistrée");
        } else {
            voitures.sort((v1, v2) -> {
                if (v1.getProprietaire() == null && v2.getProprietaire() == null) {
                    return v1.getImmatriculation().compareTo(v2.getImmatriculation());
                } else if (v1.getProprietaire() == null) {
                    return -1;
                } else if (v2.getProprietaire() == null) {
                    return 1;
                } else {
                    int comp = v1.getProprietaire().getNom().toUpperCase().compareTo(v2.getProprietaire().getNom().toUpperCase());
                    if (comp == 0) {
                        return v1.getProprietaire().getPrenom().toUpperCase().compareTo(v2.getProprietaire().getPrenom().toUpperCase());
                    } else {
                        return comp;
                    }
                }
            });
            for (Voiture voiture : voitures) {
                System.out.println("Voiture n°" + (voitures.indexOf(voiture) + 1) + " : " + voiture);
            }
        }
    }

    public static void ajouterVoiture() {
        System.out.println("Quel est le numéro de série de la voiture ?");
        long numeroSerie = sc.nextLong();
        System.out.println("Quel est l'immatriculation de la voiture ?");
        sc.nextLine();
        String immatriculation = sc.nextLine();
        System.out.println("Quelle est la marque de la voiture ?");
        String marque = sc.nextLine();
        System.out.println("Quelle est la couleur de la voiture ?");
        String couleur = sc.nextLine();
        Color color = Couleur.getColorByString(couleur);
        System.out.println("En quelle année a été produite la voiture ?");
        int annee = sc.nextInt();
        voitures.add(new Voiture(numeroSerie, immatriculation, marque, color, annee));
    }

    public static void supprimerVoiture() throws SupressionVoitureException {
        afficherVoitures();
        if (!voitures.isEmpty()) {
            System.out.println("Quelle voiture souhaitez-vous supprimer ?");
            int index = sc.nextInt();
            try {
                voitures.remove(index - 1);
                System.out.println("Véhicule supprimé !");
            } catch (IndexOutOfBoundsException e) {
                throw new SupressionVoitureException();
            }
        }
    }

    public static void modifierVoiture() throws AucuneVoitureExisteException {
        afficherVoitures();
        if (!voitures.isEmpty()) {
            System.out.println("Quelle voiture souhaitez-vous modifier ?");
            int index = sc.nextInt() - 1;
            try {
                Voiture voiture = voitures.get(index);
                System.out.println("Quel est l'immatriculation de la voiture ?");
                sc.nextLine();
                String immatriculation = sc.nextLine();
                System.out.println("Quelle est la couleur de la voiture ?");
                String couleur = sc.nextLine();
                Color color = Couleur.getColorByString(couleur);
                voiture.setImmatriculation(immatriculation);
                voiture.setCouleur(color);
                System.out.println("Voiture modifiée : " + voiture);
            } catch (IndexOutOfBoundsException e) {
                throw new AucuneVoitureExisteException();
            }
        }
    }

    public static void ajouterProprietaire() {
        afficherVoituresSansProprietaire();
        if (!voitures.isEmpty()) {
            System.out.println("Quelle voiture souhaitez-vous modifier ?");
            int index = sc.nextInt() - 1;
            Voiture voiture = voitures.get(index);
            if (voiture.getProprietaire() == null) {
                System.out.println("Quel est le nom du propriétaire ?");
                sc.nextLine();
                String nom = sc.nextLine();
                System.out.println("Quel est le prénom du propriétaire ?");
                String prenom = sc.nextLine();
                voiture.setProprietaire(new Individu(nom, prenom));
                System.out.println("Propriétaire ajouté à la voiture : " + voiture);
            } else {
                System.out.println("Cette voiture possède déjà un propriétaire : " + voiture.getProprietaire());
            }
        }
    }

    public static void afficherVoituresSansProprietaire() {
        if (!voitures.isEmpty()) {
            for (Voiture voiture : voitures) {
                if (voiture.getProprietaire() == null) {
                    System.out.println("Voiture n°" + (voitures.indexOf(voiture) + 1) + " : " + voiture);
                }
            }
        } else {
            System.err.println("Aucune voiture n'est enregistrée");
        }
    }

    public static void listerVoitureParCritere() {
        if (voitures.isEmpty()) {
            System.err.println("Aucune voiture n'est enregistrée");
        } else {
            System.out.println("Quel critère souhaitez-vous utiliser ? (1 - Numéro de série, 2 - Immatriculation, 3 - Marque, 4 - Couleur, 5 - Année)");
            int critere = sc.nextInt();
            switch (critere) {
                case 1 -> {
                    System.out.println("Quel est le numéro de série de la voiture ?");
                    long numeroSerie = sc.nextLong();
                    for (Voiture voiture : voitures) {
                        if (voiture.getNum_serie() == numeroSerie) {
                            System.out.println("Voiture n°" + (voitures.indexOf(voiture) + 1) + " : " + voiture);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Quelle est l'immatriculation de la voiture ?");
                    sc.nextLine();
                    String immatriculation = sc.nextLine();
                    for (Voiture voiture : voitures) {
                        if (voiture.getImmatriculation().equals(immatriculation)) {
                            System.out.println("Voiture n°" + (voitures.indexOf(voiture) + 1) + " : " + voiture);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Quelle est la marque de la voiture ?");
                    sc.nextLine();
                    String marque = sc.nextLine();
                    for (Voiture voiture : voitures) {
                        if (voiture.getMarque().equals(marque)) {
                            System.out.println("Voiture n°" + (voitures.indexOf(voiture) + 1) + " : " + voiture);
                        }
                    }
                }
                case 4 -> {
                    // Compare list of voiture with color and sort by brightness
                    voitures.sort(Comparator.comparingInt(v -> Couleur.getBrightness(v.getCouleur())));
                    Collections.reverse(voitures);
                    for (Voiture voiture : voitures) {
                        System.out.println("Voiture n°" + (voitures.indexOf(voiture) + 1) + " : " + voiture);
                    }
                }
                case 5 -> {
                    System.out.println("En quelle année a été produite la voiture ?");
                    int annee = sc.nextInt();
                    for (Voiture voiture : voitures) {
                        if (voiture.getAnnee() == annee) {
                            System.out.println("Voiture n°" + (voitures.indexOf(voiture) + 1) + " : " + voiture);
                        }
                    }
                }
                default -> System.err.println("Critère inconnu");
            }
        }
    }


}
