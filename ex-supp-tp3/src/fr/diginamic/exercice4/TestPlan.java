package fr.diginamic.exercice4;

import java.awt.Color;

public class TestPlan {
    public static void main(String[] args) {
        Terrasse terrasseA = new Terrasse(Color.WHITE.getRGB(), 12, 24); // affiche la terrasse A et ses informations System.out.println("Les informations de la terrasse A sont : "+terrasseA.affiche());
        Terrasse terrasseB = new Terrasse(Color.YELLOW.getRGB(), 8, 204);
        Terrasse terrasseC = new Terrasse(Color.RED.getRGB(), 102, 4);
        Etalage etalageA = new Etalage(Color.WHITE.getRGB(), 120, 204); // affiche l'etalage A et ses informations System.out.println("Les informations de l'étalage A sont : "+etalageA.affiche());
        Etalage etalageB = new Etalage(Color.MAGENTA.getRGB(), 126, 241);
        Etalage etalageC = new Etalage(Color.BLUE.getRGB(), 812, 214);
        Plan plan = new Plan("monPlan");
        plan.ajouteEmplacement(terrasseA);
        plan.ajouteEmplacement(terrasseB);
        plan.ajouteEmplacement(terrasseC);
        plan.ajouteEmplacement(etalageA);
        plan.ajouteEmplacement(etalageB);
        plan.ajouteEmplacement(etalageC);
        plan.supprimeEmplacement(etalageA);
        System.out.println(plan.affiche());
    }
}
