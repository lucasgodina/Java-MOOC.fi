import java.util.ArrayList;

public class Box implements ToBeStored{
    private double maximumWeight;
    private double currentWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maximumWeight){
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0;
        this.things = new ArrayList<ToBeStored>();
    }

    public double weight() {
        double weight = 0;
        for(ToBeStored thing : things){
            weight += thing.weight();
        }
        return weight;
    }

    public void add(ToBeStored thing){
        if(weight() + thing.weight() <= maximumWeight){
            things.add(thing);
            currentWeight += thing.weight();
        }
    }

    public String toString(){
        return "Box: " + things.size() + " things, total weight " + currentWeight + " kg";
    }
}
