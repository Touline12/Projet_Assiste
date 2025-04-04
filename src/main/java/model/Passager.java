package model;

class Passager extends Personne {
    private String passeport;

    public Passager(int identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public void reserverVol() {
        System.out.println("Passager " + nom + " a réservé un vol.");
    }

    public void annulerReservation() {
        System.out.println("Passager " + nom + " a annulé sa réservation.");
    }

    public void obtenirReservations() {
        System.out.println("Affichage des réservations du passager " + nom);
    }
}

