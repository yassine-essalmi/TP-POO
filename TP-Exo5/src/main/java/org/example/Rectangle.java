package org.example;

public class Rectangle extends Figure {
    public double longueur;
    public double largeur;

    public Rectangle() {
    }

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public String afficherDetails() {
        return super.afficherDetails() + ", longueur : " + longueur +
                ", largeur : " + largeur;
    }
}
