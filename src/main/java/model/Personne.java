package model;

public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String email;
    protected String telephone;

    public Personne(int id, String nom, String prenom, String adresse, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
    }
}
