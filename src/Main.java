import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Persistence persistence = new Persistence();

        Customer customer1 = new Customer("John Doe", 30, "johndoe@yahoo.com");
        Customer customer2 = new Customer("Jane Doe", 25, "janedoe@yahoo.com");

        Reservation reservation1 = new Reservation("One-way", 100, "10:00", "12:00", "Standard", true);

        Chauffeur chauffeur1 = new Chauffeur(1);

        Trip trip1 = new Trip(reservation1, "Trip 1", chauffeur1);

        persistence.addCustomer(customer1);
        persistence.addCustomer(customer2);

        persistence.addReservation(reservation1);

        persistence.addChauffeur(chauffeur1);

        persistence.addTrip(trip1);

        persistence.saveData();
    }
}