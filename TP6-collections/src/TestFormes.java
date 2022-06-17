import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestFormes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Forme> formes = new ArrayList<>();
        boolean continuer = true;
        do {
            System.out.println("Quelle forme voulez-vous (triangle, carré, rectangle, cercle, losange) ?");
            String forme = sc.nextLine();
            switch (forme) {
                case "triangle" -> {
                    System.out.println("Entrez la base du triangle :");
                    double base = sc.nextDouble();
                    System.out.println("Entrez la hauteur du triangle :");
                    double hauteur = sc.nextDouble();
                    Triangle triangle = new Triangle(base, hauteur);
                    formes.add(triangle);
                }
                case "carre" -> {
                    System.out.println("Quelle est la cote du carré ?");
                    double cote = sc.nextDouble();
                    Carre carre = new Carre(cote);
                    formes.add(carre);
                }
                case "rectangle" -> {
                    System.out.println("Quelle est la largeur du rectangle ?");
                    double largeur = sc.nextDouble();
                    System.out.println("Quelle est la hauteur du rectangle ?");
                    double hauteurRect = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(largeur, hauteurRect);
                    formes.add(rectangle);
                }
                case "losange" -> {
                    System.out.println("Quelle est la base du losange ?");
                    double baseLosange = sc.nextDouble();
                    System.out.println("Quelle est la hauteur du losange ?");
                    double hauteurLosange = sc.nextDouble();
                    Losange losange = new Losange(baseLosange, hauteurLosange);
                    formes.add(losange);
                }
                case "cercle" -> {
                    System.out.println("Quelle est la rayon du cercle ?");
                    double rayon = sc.nextDouble();
                    Cercle cercle = new Cercle(rayon);
                    formes.add(cercle);
                }
                default -> {
                    System.err.println("Forme inconnue");
                    continue;
                }
            }
            System.out.println("Voulez-vous continuer ? (o/n)");
            sc.nextLine();
            String reponse = sc.nextLine();
            if (reponse.equals("n")) {
                continuer = false;
            }
        } while (continuer);
        System.out.println("Voici les formes que vous avez créées :");
        for (Forme forme : formes) {
            System.out.println(forme);
        }
        System.out.println("Souhaitez-vous voir leur aire (1) ou leur perimetre (2) ou les deux (3) ?");
        int choix = sc.nextInt();
        switch (choix) {
            case 1 -> {
                System.out.println("Voici les aires des formes que vous avez créées :");
                for (Forme forme : formes) {
                    System.out.println(forme.getNom() + " : aire " + forme.aire());
                }
            }
            case 2 -> {
                System.out.println("Voici les perimetres des formes que vous avez créées :");
                for (Forme forme : formes) {
                    System.out.println(forme.getNom() + " : perimetre " + forme.perimetre());
                }
            }
            case 3 -> {
                System.out.println("Voici les aires et périmètres des formes que vous avez créées :");
                for (Forme forme : formes) {
                    System.out.println(forme.getNom() + " : aire " + forme.aire() + " et perimetre " + forme.perimetre());
                }
            }
            default -> {
                System.err.println("Choix inconnu");
            }
        }
    }
}
