package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MetierProduitImpl metierProduit = new MetierProduitImpl();
        int userInput;
        System.out.println("1. Afficher la liste des produits.\n" +
                "2. Rechercher un produit par son id.\n" +
                "3. Ajouter un nouveau produit dans la liste.\n" +
                "4. Supprimer un produit par id.\n" +
                "5. Quitter ce programme.\n");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter value between 1 - 5");

            userInput = Integer.parseInt(scanner.nextLine());

            switch (userInput) {
                case 1:
                    List<Produit> products = metierProduit.getAll();
                    if (products.isEmpty()) {
                        System.out.println("Empty List");
                    } else {
                        for (Produit produit : products) {
                            System.out.println(produit);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter id");
                    int id = Integer.parseInt(scanner.nextLine());
                    var elem = metierProduit.findById(id);
                    System.out.println(elem);
                    break;
                case 3:
                    System.out.println("enter product id");
                    Long idProduit = Long.valueOf(scanner.nextLine());
                    System.out.println("enter product nom");
                    String nom = scanner.nextLine();
                    System.out.println("enter product marque");
                    String marque = scanner.nextLine();
                    System.out.println("enter product prix");
                    Float prix = Float.valueOf(scanner.nextLine());
                    System.out.println("enter product description");
                    String description = scanner.nextLine();
                    System.out.println("enter product nombreEnStock");
                    Integer nombreEnStock = Integer.valueOf(scanner.nextLine());
                    var product = new Produit(idProduit, nom, marque, prix, description, nombreEnStock);
                    metierProduit.add(product);
                    break;
                case 4:
                    System.out.println("enter product id to delete");
                    int idToDelete = Integer.parseInt(scanner.nextLine());
                    metierProduit.delete(idToDelete);
                    break;
                default:
                    System.out.println("Invalid number. Please enter a number between 1 and 5.");
                    break;
            }
        } while (userInput != 5);
    }
}