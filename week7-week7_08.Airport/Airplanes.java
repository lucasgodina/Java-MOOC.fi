import java.util.HashMap;

public class Airplanes {
    private HashMap<String, Integer> airplanes;

    public Airplanes() {
        this.airplanes = new HashMap<String, Integer>();
    }

    public void add(String airplane, Integer capacity) {
        airplanes.put(airplane, capacity);
    }

    public String getPlaneInfo(String airplane) {
        return airplane + " (" + airplanes.get(airplane) + " ppl)";
    }

    public void printPlanes() {
        for (String airplane : airplanes.keySet()) {
            System.out.println(getPlaneInfo(airplane));
        }
    }

    public boolean airplaneExists(String airplane){
        if(airplanes.get(airplane) != null){
            return true;
        } else {
            return false;
        }
    }
}