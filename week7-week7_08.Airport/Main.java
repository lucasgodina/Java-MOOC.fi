import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airplanes airplanes = new Airplanes();
        Flights flights = new Flights(airplanes);

        TextUI ui = new TextUI(reader, airplanes, flights);
        ui.start();
    }
}
