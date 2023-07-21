public class Trip {

    private Reservation reservation;
    private String tripName;
    private Chauffeur chauffeur;

    public Trip(Reservation reservation, String tripName, Chauffeur chauffeur) {
        this.reservation = reservation; // Use "this" to refer to the instance variable
        this.tripName = tripName;
        this.chauffeur = chauffeur;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation; // Use "this" to refer to the instance variable
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur; // Use "this" to refer to the instance variable
    }

    public String toString() {
        return "Trip name: " + tripName + ", reservation: " + reservation + ", chauffeur: " + chauffeur;
    }
}
