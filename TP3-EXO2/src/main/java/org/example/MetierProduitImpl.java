package org.example;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> produitsList = new ArrayList<>();

    @Override
    public void add(Produit o) {
        produitsList.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produitsList;
    }

    @Override
    public Produit findById(int id) {
        if (id >= 0 && id < produitsList.size()) {
            return produitsList.get(id);
        } else {
            throw new IndexOutOfBoundsException("out of bound index");
        }
    }

    @Override
    public void delete(int id) {
        if (id >= 0 && id < produitsList.size()) {
            produitsList.remove(id);
        } else {
            throw new IndexOutOfBoundsException("out of bound index");
        }
    }
}
