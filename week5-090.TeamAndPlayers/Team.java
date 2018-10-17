import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player>teamPlayers;
    private int maxSize;

    public Team(String name){
        this.teamPlayers = new ArrayList<Player>();
        this.teamName = name;
        this.maxSize = 16;
    }

    public String getName(){
        return this.teamName;
    }

    public void addPlayer(Player name){
        if(this.teamPlayers.size() < this.maxSize) {
            this.teamPlayers.add(name);
        }
    }

    public void printPlayers(){
        for(Player player : teamPlayers){
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.teamPlayers.size();
    }

    public int goals(){
        int totalGoals = 0;
        for(Player player : teamPlayers){
            totalGoals += player.goals();
        }

        return totalGoals;
    }
}
