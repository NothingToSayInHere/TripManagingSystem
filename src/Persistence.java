import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persistence {

    private ArrayList<Customer> customers;
    private ArrayList<Reservation> reservations;
    private ArrayList<Trip> trips;
    private ArrayList<Chauffeur> chauffeurs;

    public Persistence() {
        customers = new ArrayList<>();
        reservations = new ArrayList<>();
        trips = new ArrayList<>();
        chauffeurs = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer); // add customer to the ArrayList
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation); // add reservation to the ArrayList
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void addChauffeur(Chauffeur chauffeur) {
        chauffeurs.add(chauffeur);
    }

    public void saveData() {
        try {
            File customersFile = new File("C:\\VIA\\sem 1\\SEP1\\persistence\\customers.txt");
            File reservationsFile = new File("C:\\VIA\\sem 1\\SEP1\\persistence\\reservations.txt");
            File tripsFile = new File("C:\\VIA\\sem 1\\SEP1\\persistence\\trips.txt");
            File chauffeursFile = new File("C:\\VIA\\sem 1\\SEP1\\persistence\\chauffeurs.txt");

            FileWriter customersWriter = new FileWriter(customersFile);
            FileWriter reservationsWriter = new FileWriter(reservationsFile);
            FileWriter tripsWriter = new FileWriter(tripsFile);
            FileWriter chauffeursWriter = new FileWriter(chauffeursFile);

            for (Customer customer : customers) {
                customersWriter.write(customer.toString() + "\n");
            }

            for (Reservation reservation : reservations) {
                reservationsWriter.write(reservation.toString() + "\n");
            }

            for (Trip trip : trips) {
                tripsWriter.write(trip.toString() + "\n");
            }

            for (Chauffeur chauffeur : chauffeurs) {
                chauffeursWriter.write(chauffeur.toString() + "\n");
            }

            customersWriter.close();
            reservationsWriter.close();
            tripsWriter.close();
            chauffeursWriter.close();
        } catch (IOException e) {
            String errorMessage = "An error occurred while saving data: " + e.getMessage();
            System.err.println(errorMessage); // Print the error message to the console.
            e.printStackTrace(); // Print the stack trace for debugging purposes.
        }
    }
}
