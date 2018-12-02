package dungeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Vampires {
    private Collection<Vampire> vampires;
    private Random random;

    public Vampires() {
        this.vampires = new ArrayList<Vampire>();
        this.random = new Random();
    }

    public void add(Dungeon dungeon) {
        while (true) {
            int x = random.nextInt(dungeon.getLength());
            int y = random.nextInt(dungeon.getHeight());
            while (x == 0 && y == 0) {
                x = random.nextInt(dungeon.getLength());
                y = random.nextInt(dungeon.getHeight());
            }
            Vampire vampire = new Vampire(x, y);
            boolean checkPosition = false;
            for (Vampire otherVampire : vampires) {
                if (otherVampire.getPosition().equals(vampire.getPosition())) {
                    checkPosition = true;
                }
            }
            if (checkPosition == false) {
                vampires.add(vampire);
                break;
            }
        }
    }

    public int getSize() {
        return vampires.size();
    }

    public void move(Dungeon dungeon) {
        for (Vampire vampire : vampires) {
            while (true) {
                int movement = random.nextInt(3);
                boolean checkBorders = false;

                if (movement == 0) {
                    if (vampire.getY() - 1 < 0) {
                        checkBorders = true;
                    } else {
                        vampire.moveUp();
                    }
                }
                if (movement == 1) {
                    if (vampire.getY() + 1 > dungeon.getHeight()) {
                        checkBorders = true;
                    } else {
                        vampire.moveDown();
                    }
                }
                if (movement == 2) {
                    if (vampire.getX() - 1 < 0) {
                        checkBorders = true;
                    } else {
                        vampire.moveLeft();
                    }
                }
                if (movement == 3) {
                    if (vampire.getX() + 1 > dungeon.getLength()) {
                        checkBorders = true;
                    } else {
                        vampire.moveRight();
                    }
                }

                boolean checkVampires = false;
                for(Vampire otherVampire : vampires){
                    if(otherVampire.getPosition().equals(vampire)){
                        checkVampires = true;
                    }
                }
                if(checkBorders == false && checkVampires == false){
                    break;
                }

            }
        }
    }

    public void checkForKill(Character character) {
        ArrayList<Vampire> toBeRemoved = new ArrayList<Vampire>();
        for (Vampire vampire : vampires) {
            if (vampire.getPosition().equals(character.getPosition())) {
                toBeRemoved.add(vampire);
            }
        }
        vampires.removeAll(toBeRemoved);
    }

    public void printLocations() {
        for (Vampire vampire : vampires) {
            System.out.println("v " + vampire.getX() + " " + vampire.getY());
        }
    }

    public void printDungeon(Character character, Dungeon dungeon) {

        for (int y = 0; y < dungeon.getHeight(); y++) {
            for (int x = 0; x < dungeon.getLength(); x++) {
                boolean isCharacter = false;
                boolean isVampire = false;
                if (character.getX() == x && character.getY() == y) {
                    System.out.print("@");
                    isCharacter = true;
                }
                for (Vampire vampire : vampires) {
                    if (vampire.getX() == x && vampire.getY() == y) {
                        System.out.print("v");
                        isVampire = true;
                    }
                }
                if (isCharacter == false && isVampire == false) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
