
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);

    }

    public static void addSuitcasesFullOfBricks(Container container){
        int amountOfSuitcases = 0;
        int weightOfBrick = 1;

        while(amountOfSuitcases != 100){
            Suitcase suitcase = new Suitcase(100);
            Thing brick = new Thing("Brick", weightOfBrick);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);

            amountOfSuitcases++;
            weightOfBrick++;
        }
    }
}
