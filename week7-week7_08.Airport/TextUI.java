import java.util.Scanner;

public class TextUI {
    private Scanner reader;
    private Airplanes airplanes;
    private Flights flights;

    public TextUI(Scanner reader, Airplanes airplanes, Flights flights){
        this.reader = reader;
        this.airplanes = airplanes;
        this.flights = flights;
    }

    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String operation = reader.nextLine();

            if(operation.equals("1")){
                addAirplane();
            } else if(operation.equals("2")){
                addFlight();
            } else if(operation.equals("x")){
                break;
            }
        }
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println();
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String operation = reader.nextLine();

            if(operation.equals("1")){
                airplanes.printPlanes();
            } else if(operation.equals("2")){
                flights.printFlights();
            } else if(operation.equals("3")){
                planeInfo();
            } else if(operation.equals("x")){
                break;
            }
        }
    }

    public void addAirplane(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());

        airplanes.add(planeID, capacity);
    }

    public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();

        flights.add(departure, destination, planeID);
    }

    public void planeInfo(){
        System.out.print("Give plane ID: ");
        String airplane = reader.nextLine();
        System.out.println(airplanes.getPlaneInfo(airplane));
    }
}
