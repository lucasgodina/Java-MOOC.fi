package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private Collection<Thing> things;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() + getWeight() <= maxWeight){
            things.add(thing);
        }
    }

    public int getWeight(){
        int weight = 0;
        for(Thing thing : things){
            weight += thing.getWeight();
        }

        return weight;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing thingInBox : things){
            if(thingInBox.equals(thing)){
                return true;
            }
        }
        return false;
    }

    public Collection<Thing> getThings(){
        return this.things;
    }
}
