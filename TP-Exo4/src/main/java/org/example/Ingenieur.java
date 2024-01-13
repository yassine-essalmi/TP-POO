package org.example;

public class Ingenieur extends Employe{

    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                "specialite='" + specialite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public String calculerSalire() {
        return "le salaire avec l'ogmentation est : " + salaire * 1.15;
    }
}
