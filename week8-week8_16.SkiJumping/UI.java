import java.util.Scanner;

public class UI {
    private Scanner reader;
    private Participants participants;
    private int round;


    public UI(Scanner reader, Participants participants){
        this.reader = reader;
        this.participants = participants;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String s = reader.nextLine();
            if (s.equals("")) {
                break;
            } else {
                participants.add(s);
            }
        }
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String s = reader.nextLine();
            if(s.equals("jump")){
                round++;
                System.out.println("Round " + round);
                System.out.println();
                System.out.println("Jumping order:");
                participants.jumpOrder();
                System.out.println("Results of round " + round);
                participants.round();
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        participants.tournamentResults();
    }
}
