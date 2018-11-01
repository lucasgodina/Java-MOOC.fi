import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if ((totalWeight() + thing.getWeight()) <= maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        if (things.size() == 0) {
            return null;
        } else {
            Thing heaviestThing = things.get(0);
            for (Thing thing : things) {
                if (thing.getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        }
    }

    public String toString() {
        if (things.size() == 0) {
            return "empty (0kg)";

        } else if (things.size() == 1) {
            return things.size() + " thing (" + totalWeight() + " kg)";

        } else {
            return things.size() + " things (" + totalWeight() + " kg)";
        }
    }
}
