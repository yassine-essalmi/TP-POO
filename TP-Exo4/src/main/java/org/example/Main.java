package org.example;

public class Main {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("hamid", "hamid", "h@h.com", "067373737", 10000, "dev mobile");
        System.out.println(ingenieur);
        System.out.println(ingenieur.calculerSalire());
        Manager manager =new Manager("rachid", "rachid", "rachid@rachid.com", "0673737378",15000, "project manager");
        System.out.println(manager);
        System.out.println(manager.calculerSalire());

    }
}