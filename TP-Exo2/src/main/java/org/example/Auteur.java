package org.example;

public class Auteur extends Personne{
    private String numAuteur;

    public Auteur() {
    }

    public Auteur(String nom, String prenom, String email, String tel, int age, String numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    public String getNumAuteur() {
        return numAuteur;
    }

    public void setNumAuteur(String numAuteur) {
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return super.toString() + ", numAuteur = " + numAuteur;
    }
}
