package org.example;

public class Moto extends Vehicule{
    private String marque;
    private String puissance;

    public Moto(String nom, double prix, String marque, String puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public void emettreSon(){
        System.out.println("La moto rugit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("marque : " + marque + ", puissance : " + puissance );
    }
}
