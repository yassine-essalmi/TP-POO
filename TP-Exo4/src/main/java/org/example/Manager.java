package org.example;

public class Manager extends Employe{

    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "service='" + service + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public String calculerSalire() {
        return "le salaire avec l'ogmentation est : " + salaire * 1.20;
    }
}
