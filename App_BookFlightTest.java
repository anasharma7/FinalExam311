import java.time.LocalDate;
import java.util.ArrayList;

public class App_BookFlightTest {

    public static void main(String[] args) {
        App_BookFlightTest app_test = new App_BookFlightTest();
        app_test.testAddFlight();
        app_test.testGetFlight();
        app_test.testBookTicket();
    }

    public void testAddFlight() {
        App_BookFlight app = new App_BookFlight();
        Airport origin1 = new Airport("JFK", "John F. Kennedy International Airport", "USA");
        Airport dest1 = new Airport("LAX", "Los Angeles", "USA");
        Flight flight1 = new Flight("AA123", LocalDate.of(2023, 5, 15), origin1, dest1, 800, 360);
        app.addFlight(flight1);
        ArrayList<Flight> flights = app.getFlights();
        assert flights.size() == 1;
        assert flights.get(0).equals(flight1);
    }

    public void testGetFlight() {
        App_BookFlight app = new App_BookFlight();
        Airport origin1 = new Airport("JFK", "John F. Kennedy International Airport", "USA");
        Airport dest1 = new Airport("LAX", "Los Angeles", "USA");
        Flight flight1 = new Flight("AA123", LocalDate.of(2023, 5, 15), origin1, dest1, 800, 360);
        app.addFlight(flight1);
        Flight foundFlight = app.getFlight("AA123");
        assert foundFlight.equals(flight1);
    }

    public void testBookTicket() {
        App_BookFlight app = new App_BookFlight();
        Airport origin1 = new Airport("JFK", "John F. Kennedy International Airport", "USA");
        Airport dest1 = new Airport("LAX", "Los Angeles", "USA");
        Airport origin2 = new Airport("LAX", "Los Angeles", "USA");
        Airport dest2 = new Airport("SFO", "San Francisco", "USA");
        Flight flight1 = new Flight("AA123", LocalDate.of(2023, 5, 15), origin1, dest1, 800, 360);
        Flight flight2 = new Flight("UA456", LocalDate.of(2023, 5, 15), origin2, dest2, 1100, 90);
        app.addFlight(flight1);
        app.addFlight(flight2);
        Ticket ticket = app.bookTicket(origin1, dest2, LocalDate.of(2023, 5, 15));
        assert ticket != null;
        assert ticket.getFlight().equals(flight1);
        assert ticket.getOrigin().equals(origin1);
        assert ticket.getDestination().equals(dest2);
        assert ticket.getDate().equals(LocalDate.of(2023, 5, 15));
    }

}
