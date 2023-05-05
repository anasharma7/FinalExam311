import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // create an instance of App_BookFlight
        App_BookFlight app = new App_BookFlight();

        // create some airports and flights
        Airport origin1 = new Airport("JFK", "John F. Kennedy International Airport", "USA");
        Airport dest1 = new Airport("LAX", "Los Angeles", "USA");
        Flight flight1 = new Flight("AA123", LocalDate.of(2023, 5, 15), origin1, dest1, 800, 360);
        app.getFlights().add(flight1);

        Airport origin2 = new Airport("LAX", "Los Angeles", "USA");
        Airport dest2 = new Airport("SFO", "San Francisco", "USA");
        Flight flight2 = new Flight("UA456", LocalDate.of(2023, 5, 15), origin2, dest2, 1100, 90);
        app.getFlights().add(flight2);

        // book a ticket
        app.bookTicket(origin1, dest2, LocalDate.of(2023, 5, 15));
    }
}
