package org.example;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("toyota",100000, "2020", 2020);
        voiture.afficherInformations();
        voiture.emettreSon();
        System.out.println("__________________________________________________________________");
        Moto moto = new Moto("bmw", 160000, "marque1", "1000");
        moto.afficherInformations();
        moto.emettreSon();
        System.out.println("__________________________________________________________________");
        Avion avion = new Avion("avion1", 100000000, "DMR", 500);
        avion.afficherInformations();
        avion.emettreSon();
    }
}