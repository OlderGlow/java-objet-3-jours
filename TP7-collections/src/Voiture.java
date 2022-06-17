import java.awt.*;

public class Voiture {
    private final long num_serie;
    private String immatriculation;
    private final String marque;
    private Color couleur;
    private final int annee;
    private Individu proprietaire;

    public Voiture(long num_serie, String immatriculation, String marque, Color couleur, int annee) {
        this.num_serie = num_serie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
    }

    public long getNum_serie() {
        return num_serie;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getAnnee() {
        return annee;
    }

    public Individu getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Numéro de série : ").append(num_serie);
        sb.append(", Immatriculation : ").append(immatriculation);
        sb.append(", Marque : ").append(marque);
        sb.append(", Couleur : ").append(Couleur.getStringByColor(couleur));
        sb.append(", Année de fabrication : ").append(annee);
        if (proprietaire != null) {
            sb.append(", Propriétaire : ").append(proprietaire.getNom()).append(" ").append(proprietaire.getPrenom());
        }
        return sb.toString();
    }

}
