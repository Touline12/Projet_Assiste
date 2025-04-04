package model;

public class PersonnelCabine extends Employe {
    private String fonction; // ex : Chef de cabine, hôtesse, steward

    public PersonnelCabine(int id, String nom, String prenom, String adresse, String email, String telephone, String role, String fonction) {
        super(id, nom, prenom, adresse, email, telephone, role);
        this.fonction = fonction;
    }
}
