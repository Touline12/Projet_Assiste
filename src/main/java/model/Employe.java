package model;

class Employe extends Personne {
    protected int numeroEmploye;
    protected String dateEmbauche;

    public Employe(int identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole() {
        return "Employé";
    }
}
