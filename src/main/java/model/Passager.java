package model;

public class Passager extends Personne {
    private String numeroPasseport;

    public Passager(int id, String nom, String prenom, String adresse, String email, String telephone, String numeroPasseport) {
        super(id, nom, prenom, adresse, email, telephone);
        this.numeroPasseport = numeroPasseport;
    }
}
