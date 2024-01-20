package org.example;

public class Livre implements Empruntable {

    private String titre;
    private String auteur;
    private Boolean emprunte;

    @Override
    public void emprunter() {
        if (!emprunte) {
            this.emprunte = true;
            System.out.println("Le Livre " + titre + " réalisé par " + auteur + " a été emprunté.");
        } else {
            System.out.println("Le Livre est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            this.emprunte = false;
            System.out.println("Le Livre " + titre + " réalisé par " + auteur + " a été retourné.");
        } else {
            System.out.println("Le Livre n'est pas actuellement emprunté.");
        }
    }

    public Livre() {
    }

    public Livre(String titre, String auteur, Boolean emprunte) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = emprunte;
    }
}
