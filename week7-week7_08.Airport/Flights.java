import java.util.HashMap;

public class Flights {
    private HashMap<String, String> flights;
    private Airplanes airplanes;

    public Flights(Airplanes airplanes) {
        this.flights = new HashMap<String, String>();
        this.airplanes = airplanes;
    }

    public String flight(String departure, String destination) {
        return "(" + departure + "-" + destination + ")";
    }

    public void add(String departure, String destination, String airplane) {
        String flight = flight(departure, destination);

        if (airplanes.airplaneExists(airplane)) {
            flights.put(flight, airplane);
        }
    }

    public void printFlights() {
        for (String flight : flights.keySet()) {
            System.out.println(airplanes.getPlaneInfo(flights.get(flight)) + " " + flight);
        }
    }
}
