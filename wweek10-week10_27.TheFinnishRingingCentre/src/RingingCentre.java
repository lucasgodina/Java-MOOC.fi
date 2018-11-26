import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, List<String>> observations;

    public RingingCentre(){
        this.observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String location){
        if(observations.get(bird) == null){
            observations.put(bird, new ArrayList<String>());
        }
        observations.get(bird).add(location);
    }

    public void observations(Bird bird){
        int counter = 0;
        ArrayList<String> locations = new ArrayList<String>();
        if(observations.get(bird) != null) {
            for (Bird birdObserved : observations.keySet()) {
                if (bird.equals(birdObserved)) {
                    System.out.println(bird + " observations: " + observations.get(bird).size());
                    for (String location : observations.get(bird)) {
                        System.out.println(location);
                    }
                }
            }
        } else {
            System.out.println(bird + " observations: " + counter);
        }
    }
}