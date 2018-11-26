package farmsimulator;


import java.util.ArrayList;
import java.util.Collection;

public class Farm {
    private String owner;
    private Collection<Cow> cows;
    private Barn barn;

    public Farm(String name, Barn barn){
        this.owner = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner(){
        return this.owner;
    }

    public void addCow(Cow cow){
        cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }

    public void liveHour(){
        for(Cow cow : cows){
            cow.liveHour();
        }
    }

    public void manageCows(){
        barn.takeCareOf(cows);
    }

    public String toString(){
        String stringCows = "";
        for(Cow cow : cows){
            stringCows += "\n        " + cow.toString();
        }

        return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + barn.getBulkTank() + "\nAnimals:" + stringCows;
    }
}
