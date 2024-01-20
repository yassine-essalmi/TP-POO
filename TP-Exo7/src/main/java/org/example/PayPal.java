package org.example;

public class PayPal extends Paiement {

    private String email;

    @Override
    void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " effectué avec PayPal. Adresse e-mail : " + email);
    }

    public PayPal(String email) {
        this.email = email;
    }
}
