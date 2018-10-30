
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Mikael");
        printWithSmileys("Arto");
        printWithSmileys("Matti");
    }

    private static void printWithSmileys(String characterString){
        printSmiley((characterString.length() + 6) / 2);
        if(characterString.length() % 2 == 1){
            printSmiley(1);
        }

        System.out.println();
        printSmiley(1);
        System.out.print(" " + characterString + " ");
        if(characterString.length() % 2 == 1){
            System.out.print(" ");
        }
        printSmiley(1);
        System.out.println();


        printSmiley((characterString.length() + 6) / 2);
        if(characterString.length() % 2 == 1){
            printSmiley(1);
        }
        System.out.println();

    }


    private static void printSmiley(int times){
        int buffer = 0;
        while(buffer < times){
            System.out.print(":)");
            buffer++;
        }
    }
}
