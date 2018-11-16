package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maxCapacity;
    private List<Thing> box;

    public Box(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing){
        if(thing.getVolume() + getVolume() <= maxCapacity){
            box.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int currentCapacity = 0;
        for(Thing thing : box){
            currentCapacity += thing.getVolume();
        }
        return currentCapacity;
    }
}
