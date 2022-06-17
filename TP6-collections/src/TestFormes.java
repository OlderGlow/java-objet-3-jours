import java.util.List;
import java.util.Scanner;

public class TestFormes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        do {
            System.out.println("Quelle forme voulez-vous (triangle, carré, rectangle, cercle, losange) ?");
            String forme = sc.nextLine();
            switch (forme) {
                case "triangle" -> {
                    System.out.println("Entrez le premier côté :");
                    double a = sc.nextDouble();
                    System.out.println("Entrez le deuxième côté :");
                    double b = sc.nextDouble();
                    System.out.println("Entrez le troisième côté :");
                    double c = sc.nextDouble();
                    Triangle triangle = new Triangle(a, b, c);
                    Forme.addForme(triangle);
                }
                case "carre" -> {
                    System.out.println("Quelle est la cote du carré ?");
                    double cote = sc.nextDouble();
                    Carre carre = new Carre(cote);
                    Forme.addForme(carre);
                }
                case "rectangle" -> {
                    System.out.println("Quelle est la largeur du rectangle ?");
                    double largeur = sc.nextDouble();
                    System.out.println("Quelle est la hauteur du rectangle ?");
                    double hauteurRect = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(largeur, hauteurRect);
                    Forme.addForme(rectangle);
                }
                case "losange" -> {
                    System.out.println("Quelle est la base du losange ?");
                    double baseLosange = sc.nextDouble();
                    System.out.println("Quelle est la hauteur du losange ?");
                    double hauteurLosange = sc.nextDouble();
                    Losange losange = new Losange(baseLosange, hauteurLosange);
                    Forme.addForme(losange);
                }
                case "cercle" -> {
                    System.out.println("Quelle est la rayon du cercle ?");
                    double rayon = sc.nextDouble();
                    Cercle cercle = new Cercle(rayon);
                    Forme.addForme(cercle);
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
        for (Forme forme : Forme.getFormes()) {
            System.out.println(forme);
        }
    }
}
