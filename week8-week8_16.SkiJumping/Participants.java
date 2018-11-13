import java.util.ArrayList;
import java.util.Collections;

public class Participants {
    private ArrayList<Participant> participants;

    public Participants(){
        this.participants = new ArrayList<Participant>();
    }

    public void add(String participant){
        participants.add(new Participant(participant));
    }

    public void addScore(Participant participant, int score){
        for(Participant participantSearch : participants){
            if(participant.getName().equals(participantSearch.getName())){
                participantSearch.sumScore(score);
            }
        }
    }

    public void jumpOrder(){
        Collections.sort(participants);
        int i = 1;
        for(Participant participant : participants){
            System.out.println("  " + i + ". " + participant);
            i++;
        }
    }

    public void round(){
        for(Participant participant : participants){
            Jump jump = new Jump(participant);
            System.out.println("  " + participant.getName());
            jump.DoJump();
            jump.judgeEvaluates();
            addScore(participant, jump.getFinalScore());
        }
    }

    public void tournamentResults(){
        Collections.sort(participants);
        Collections.reverse(participants);
        int i = 1;
        for(Participant participant : participants) {
            System.out.println(i + "           " + participant);
            System.out.println("            jump lengths: " + participant.getJump());
            i++;
        }
    }
}
