public class Traveller {
    private String name;
    private int travellerID;

    public Traveller(String name, int travellerID) {
        this.name = name;
        this.travellerID = travellerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTravellerID() {
        return travellerID;
    }

    public void setTravellerID(int travellerID) {
        this.travellerID = travellerID;
    }
}
