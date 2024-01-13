package org.example;

public class Livre {

    private Integer ISBN;
    private String titre;
    private Auteur auteur;

    public Livre() {
    }

    public Livre(Integer ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "ISBN=" + ISBN +
                ", titre='" + titre + '\'' +
                ", auteur=" + auteur;
    }
}
