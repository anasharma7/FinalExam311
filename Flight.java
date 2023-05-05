import java.time.LocalDate;

public class Flight {
    private String flightID;
    private LocalDate flightDate;
    private Airport originAirport;
    private Airport destinationAirport;
    private int startTime;
    private int duration;

    public Flight(String flightID, LocalDate flightDate, Airport originAirport, Airport destinationAirport,
                  int startTime, int duration) {
        this.flightID = flightID;
        this.flightDate = flightDate;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.startTime = startTime;
        this.duration = duration;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public Airport getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(Airport originAirport) {
        this.originAirport = originAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFlightNumber() {
        return flightID;
    }
}
