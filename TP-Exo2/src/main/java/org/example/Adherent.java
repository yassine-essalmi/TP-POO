package org.example;

public class Adherent extends Personne {
    private String numAdherent;

    public Adherent() {
    }

    public Adherent(String nom, String prenom, String email, String tel, int age, String numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    public String getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(String numAdherent) {
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return super.toString() + ", numAdherent = " + numAdherent ;

    }
}
