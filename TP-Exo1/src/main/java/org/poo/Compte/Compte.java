package org.poo.Compte;

public class Compte {

    private long num;
    private String nomClient;
    private double solde;

    public long getNum() {
        return num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public double getSolde() {
        return solde;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setSolde(long solde) {
        this.solde = solde;
    }

    public Compte() {

    }

    public Compte(long num, String nomClient, long solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public void afficherCompteInfo() {
        System.out.println("num : " + num + ", nomClient : " + nomClient + ", solde : " + solde);
    }

    void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("solde insuffisant");
        }
    }

    void deposer(double montant) {
        solde += montant;
    }
}
