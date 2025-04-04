package model;

public class Pilote extends Employe {
    private String licence;

    public Pilote(int id, String nom, String prenom, String adresse, String email, String telephone, String role, String licence) {
        super(id, nom, prenom, adresse, email, telephone, role);
        this.licence = licence;
    }
}
