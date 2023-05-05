import java.util.ArrayList;

public class Itinerary {
    private Booking booking;
    private ArrayList<Flight> flights;

    public Itinerary(Booking booking, ArrayList<Flight> flights) {
        this.booking = booking;
        this.flights = flights;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
