package src.main.java.model;

public class Vol {

    private int numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public void planifierVol() {
        System.out.println("Vol " + numeroVol + " planifié de " + origine + " à " + destination);
    }

    public void annulerVol() {
        System.out.println("Vol " + numeroVol + " annulé");
    }

    public void modifierVol() {
        System.out.println("Vol " + numeroVol + " modifié");
    }

    public void listingPassager() {
        System.out.println("Passagers du vol " + numeroVol + " sont :");
    }
}
