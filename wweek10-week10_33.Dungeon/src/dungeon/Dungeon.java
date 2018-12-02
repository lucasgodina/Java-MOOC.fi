package dungeon;

import java.util.Scanner;

public class Dungeon {
    private int length;
    private int height;
    private Vampires vampires;
    private int amountOfVampires;
    private Character character;
    private boolean vampiresMove;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = new Vampires();
        this.amountOfVampires = vampires;
        this.character = new Character(moves);
        this.vampiresMove = vampiresMove;
        this.reader = new Scanner(System.in);
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public void run() {
        while (vampires.getSize() < this.amountOfVampires) {
            vampires.add(this);
        }
        while (true) {
            if (vampires.getSize() <= 0) {
                System.out.println("YOU WIN");
                break;
            } else if (character.getMovesLeft() == 0) {
                System.out.println("YOU LOSE");
                break;
            }
            System.out.println(character.getMovesLeft());
            System.out.println("\n@ " + character.getX() + " " + character.getY());
            vampires.printLocations();
            System.out.println();
            vampires.printDungeon(character, this);
            System.out.println();
            String s = reader.nextLine();
            if(s.equals("")) {
                character.decreaseMoves();

            } else {
                for (int i = 0; i < s.length(); i++) {
                    character.move(s.charAt(i), this);
                }
            }
            vampires.checkForKill(character);
            if (vampiresMove == true) {
                vampires.move(this);
            }
        }
    }
}
