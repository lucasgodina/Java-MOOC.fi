import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<Bird>();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        while (true) {
            System.out.print("?");
            String n = scanner.nextLine();
            if (n.equals("Quit")) {
                break;
            } else if (n.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.println();
                System.out.println("Latin Name: ");
                String latinName = scanner.nextLine();
                System.out.println();
                birds.add(new Bird(name, latinName));
            } else if (n.equals("Observation")) {
                System.out.print("What was observed? ");
                String name = scanner.nextLine();
                boolean exist = false;
                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        bird.observation();
                        exist = true;
                    }
                }
                if (exist == false) {
                    System.out.println("Is not a bird!");
                }
            } else if (n.equals("Statistics")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            } else if (n.equals("Show")) {
                System.out.print("What? ");
                String name = scanner.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                    }
                }
            }
        }
    }
}
