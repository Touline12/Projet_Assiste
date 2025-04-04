package model;

import model.Personne;

// Classe Employe qui hérite de Personne
public class Employe extends Personne {
    private String role;

    // Constructeur
    public Employe(int id, String nom, String prenom, String adresse, String email, String telephone, String role) {
        super(id, nom, prenom, adresse, email, telephone);
        this.role = role;
    }
}