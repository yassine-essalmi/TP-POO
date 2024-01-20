package org.example;

public class DVD implements Empruntable {

    private String titre;
    private String realisateur;
    private Boolean emprunte;

    @Override
    public void emprunter() {
        if (!emprunte) {
            this.emprunte = true;
            System.out.println("Le DVD " + titre + " réalisé par " + realisateur + " a été emprunté.");
        } else {
            System.out.println("Le DVD est déjà emprunté.");
        }
        this.emprunte = true;
    }

    @Override
    public void retourner() {
        if (emprunte) {
            this.emprunte = false;
            System.out.println("Le DVD " + titre + " réalisé par " + realisateur + " a été retourné.");
        } else {
            System.out.println("Le DVD n'est pas actuellement emprunté.");
        }
    }

    public DVD() {
    }

    public DVD(String titre, String realisateur, Boolean emprunte) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = emprunte;
    }
}
