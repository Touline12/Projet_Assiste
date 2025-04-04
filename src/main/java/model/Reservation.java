package src.main.java.model;

public class Reservation {

    private int numeroReservation;
    private String dateReservation;
    private String statut;

    public Reservation(int numeroReservation, String dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public void confirmerReservation() {
        System.out.println("Réservation " + numeroReservation + " confirmée.");
    }

    public void annulerReservation() {
        System.out.println("Réservation " + numeroReservation + " annulée.");
    }

    public void modifierReservation() {
        System.out.println("Réservation " + numeroReservation + " modifiée.");
    }

}
