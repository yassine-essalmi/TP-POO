package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StorageGenerique<String> storageGenerique = new StorageGenerique<>(new ArrayList<>());
        storageGenerique.addElement("elem1");
        storageGenerique.addElement("elem2");
        storageGenerique.addElement("elem3");
        var elem = storageGenerique.getElement(0);
        System.out.println(elem);
        storageGenerique.getSize();
        storageGenerique.removeElement(2);
        var elems = storageGenerique.getElements();
        System.out.println(elems);
    }
}