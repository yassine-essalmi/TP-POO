package org.example;

public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("adherent1","adherent1", "ad@ad.com","0673728278", 23, "1121213");
        Auteur auteur = new Auteur("auth1", "auth1", "auth@auth.com","0673733833", 44, "1");
        Livre livre = new Livre(12, "title", auteur);
        System.out.println(adherent);
        System.out.println(auteur);
        System.out.println(livre);
    }
}