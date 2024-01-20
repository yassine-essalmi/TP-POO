package org.example;

public class GestionPaiementApp {
    public static void main(String[] args) {
        Paiement carteCredit = new CarteCredit("1234-5678-9012-3456");
        Paiement payPal = new PayPal("email@email.com");
        Commande commande1 = new Commande(12000, carteCredit);
        Commande commande2 = new Commande(12000, payPal);

        commande1.processPayment();
        commande2.processPayment();
    }
}