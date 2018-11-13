public class Participant implements Comparable<Participant> {
    private String name;
    private int score;
    private String jumps;

    public Participant(String name) {
        this.name = name;
        this.score = 0;
        this.jumps = "";
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public String getJump(){
        return this.jumps.substring(0, jumps.length() - 1);
    }

    public void sumScore(int score){
        this.score += score;
    }

    public void addJump(int jump){
        jumps = jumps + jump + " m,";
    }

    @Override
    public String toString() {
        return this.name + " (" + score + " points)";
    }

    @Override
    public int compareTo(Participant participant){
        return this.score - participant.getScore();
    }
}
