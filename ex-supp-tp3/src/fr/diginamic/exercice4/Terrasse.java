package fr.diginamic.exercice4;

public class Terrasse extends Emplacement {
    public Terrasse(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    public String affiche() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Terrasse : ");
        sb.append("Couleur : ").append(this.getCouleur()).append(" ");
        sb.append("xCentre : ").append(this.getxCentre()).append(" ");
        sb.append("yCentre : ").append(this.getyCentre()).append(" ");
        return sb.toString();
    }
}
