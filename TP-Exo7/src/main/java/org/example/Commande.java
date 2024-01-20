package org.example;

public class Commande {

    private double montant;
    private Paiement moyenPaiement;

    void processPayment() {
        moyenPaiement.effectuerPaiement(montant);
    }

    public Commande(double montant, Paiement moyenPaiement) {
        this.montant = montant;
        this.moyenPaiement = moyenPaiement;
    }
}
