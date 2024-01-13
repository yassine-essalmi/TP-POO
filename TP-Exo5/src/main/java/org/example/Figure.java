package org.example;

public abstract class Figure {

    protected String nom;

    public Figure() {
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public String afficherDetails() {
        return "nom : " + nom + ", aire : " + calculerAire() +
                ", perimetre : " + calculerPerimetre();
    }
}
