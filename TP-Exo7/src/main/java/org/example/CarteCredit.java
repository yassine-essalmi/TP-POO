package org.example;

public class CarteCredit extends Paiement {

    private String numCarte;

    @Override
    void effectuerPaiement(double montant) {
        System.out.println("Vous avez effectué un paiement de "+ montant + " avec votre carte de crédit " + numCarte );
    }

    public CarteCredit(String numCarte) {
        this.numCarte = numCarte;
    }
}
