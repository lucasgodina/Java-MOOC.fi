import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container;

    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        if((this.totalWeight() + suitcase.totalWeight()) <= maxWeight ){
            container.add(suitcase);
        }
    }

    public int totalWeight(){
        int weight = 0;
        for(Suitcase suitcase : container){
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void printThings(){
        for(Suitcase suitcase : container){
            suitcase.printThings();
        }
    }

    public String toString(){
        return container.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
