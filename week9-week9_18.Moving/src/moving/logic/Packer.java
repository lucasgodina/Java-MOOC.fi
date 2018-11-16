package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<Box>();
        int i = 0;
        boxes.add(new Box(boxesVolume));

        for(Thing thing : things){
            if(boxes.get(i).addThing(thing) == true){
                boxes.get(i).addThing(thing);
            } else {
                boxes.add(new Box(boxesVolume));
                i++;
                boxes.get(i).addThing(thing);
            }
        }
        return boxes;
    }
}
