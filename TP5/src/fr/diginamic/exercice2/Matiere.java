package fr.diginamic.exercice2;

import java.time.LocalDate;

public class Matiere {
    private String nom;
    private LocalDate date;
    private int note;
    private String commentaire;

    public Matiere(String nom, LocalDate date, int note, String commentaire) {
        this.nom = nom;
        this.date = date;
        this.note = note;
        this.commentaire = commentaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(nom.toUpperCase());
        sb.append("\n");
        sb.append("Date : ");
        sb.append(date);
        sb.append("\n");
        sb.append("Note : ");
        sb.append(note);
        sb.append("\n");
        sb.append("Commentaire : ");
        sb.append(commentaire);
        return sb.toString();
    }
}
