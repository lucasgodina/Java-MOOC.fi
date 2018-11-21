import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Scanner reader = new Scanner(System.in);
        PhoneSearch phoneSearch = new PhoneSearch();

        UI ui = new UI(reader, phoneSearch);
        ui.start();
    }
}
