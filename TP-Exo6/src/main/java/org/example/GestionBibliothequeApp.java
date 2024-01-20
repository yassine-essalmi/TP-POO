package org.example;


public class GestionBibliothequeApp {
    public static void main(String[] args) {

        Livre livre = new Livre("titre1", "Ahmed", false);
        DVD dvd = new DVD("titre1", "Ahmed", false);
        Utilisateur utilisateur = new Utilisateur("user1");

        utilisateur.emprunterObjet(livre);
        utilisateur.emprunterObjet(dvd);

        utilisateur.retourneObjet(livre);
        utilisateur.retourneObjet(dvd);

    }
}