import java.time.LocalDate;
import java.util.ArrayList;

public class App_BookFlight {
    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;
    private ArrayList<Itinerary> itineraries;

    public App_BookFlight() {
        this.flights = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.itineraries = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public void generateMultipleRoutes(Airport origAirport, Airport destAirport, LocalDate travelDate) {
        ArrayList<Flight> possibleFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOriginAirport().equals(origAirport) &&
                    flight.getDestinationAirport().equals(destAirport) &&
                    flight.getFlightDate().equals(travelDate)) {
                possibleFlights.add(flight);
            }
        }
        // Code to generate multiple routes using the possibleFlights ArrayList
        // ...
    }

    public void bookTicket(Airport origAirport, Airport destAirport, LocalDate travelDate) {
        ArrayList<Flight> possibleFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOriginAirport().equals(origAirport) &&
                    flight.getDestinationAirport().equals(destAirport) &&
                    flight.getFlightDate().equals(travelDate)) {
                possibleFlights.add(flight);
            }
        }
        // Code to book ticket using the possibleFlights ArrayList
        // ...
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public ArrayList<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public void setItineraries(ArrayList<Itinerary> itineraries) {
        this.itineraries = itineraries;
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

    public Flight getFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null; // If no flight is found
    }
}