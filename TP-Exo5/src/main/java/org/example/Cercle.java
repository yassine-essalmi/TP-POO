package org.example;

public class Cercle extends Figure{
    private double rayon;

    public Cercle() {
    }

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(rayon,2);
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public String afficherDetails() {
        return super.afficherDetails() + ", rayon : " + rayon;
    }

}
