package org.example;

public class Utilisateur {

    private String nom;

    void emprunterObjet(Empruntable objet) {
        objet.emprunter();
    }

    void retourneObjet(Empruntable objet) {
        objet.retourner();
    }

    public Utilisateur(String nom) {
        this.nom = nom;
    }
}
