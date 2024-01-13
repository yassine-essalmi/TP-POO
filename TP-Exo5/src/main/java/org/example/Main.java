package org.example;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("C1", 10);
        Rectangle rectangle = new Rectangle("R1", 5, 10);
        System.out.println("L'aire est : " + cercle.calculerAire());
        System.out.println("Le perimetre est : " + cercle.calculerPerimetre());
        System.out.println("L'aire est : " + rectangle.calculerAire());
        System.out.println("Le perimetre est : " +rectangle.calculerPerimetre());
        System.out.println(cercle.afficherDetails());
        System.out.println(rectangle.afficherDetails());
    }
}