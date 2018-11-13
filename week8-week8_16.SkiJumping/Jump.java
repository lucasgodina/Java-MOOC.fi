import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jump {
    private int length;
    private ArrayList<Integer> judgeVotes;
    private Participant participant;
    private Random random;

    public Jump(Participant participant) {
        this.participant = participant;
        this.length = 0;
        this.judgeVotes = new ArrayList<Integer>();
        this.random = new Random();
    }

    public void DoJump() {
        this.length = random.nextInt(120 - 60 + 1) + 60;
        participant.addJump(this.length);
        System.out.println("    length: " + this.length);
    }

    public void judgeEvaluates() {
        int i = 0;
        while (i < 5) {
            judgeVotes.add(random.nextInt(20 - 10 + 1) + 10);
            i++;
        }

        System.out.println("    judge votes: [" + judgeVotes.get(0) + ", " + judgeVotes.get(1) + ", " + judgeVotes.get(2) + ", " + judgeVotes.get(3) + ", " + judgeVotes.get(4) + "]" );
    }

    public int getFinalScore() {
        int totalOfJudge = 0;
        for (int vote : judgeVotes) {
            totalOfJudge += vote;
        }

        int min = judgeVotes.get(0);
        for(int vote : judgeVotes){
            if(vote < min){
                min = vote;
            }
        }

        int max = judgeVotes.get(0);
        for(int vote : judgeVotes){
            if(vote > max){
                max = vote;
            }
        }

        return totalOfJudge + length - min - max;
    }
}
