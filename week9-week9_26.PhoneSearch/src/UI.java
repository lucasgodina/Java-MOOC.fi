import java.util.Scanner;

public class UI {
    private Scanner reader;
    private PhoneSearch phoneSearch;

    public UI(Scanner reader, PhoneSearch phoneSearch){
        this.reader = reader;
        this.phoneSearch = phoneSearch;
    }

    public void start(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");

        while(true){
            System.out.print("command: ");
            String s = reader.nextLine();
            if(s.equals("1")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                phoneSearch.add(name, number);
            }

            if(s.equals("2")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.println(phoneSearch.searchByPerson(name));
            }

            if(s.equals("3")){
                System.out.print("whose number: ");
                String number = reader.nextLine();
                System.out.println(phoneSearch.searchByNumber(number));
            }
            if(s.equals("4")){
                System.out.print("whose address: ");
                String name = reader.nextLine();
                System.out.print("street: ");
                String street = reader.nextLine();
                System.out.print("city: ");
                String city = reader.nextLine();
                phoneSearch.addAddress(name, street, city);
            }
            if(s.equals("5")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                phoneSearch.informationSearch(name);
            }
            if(s.equals("6")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                phoneSearch.deleteInformation(name);
            }
            if(s.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String string = reader.nextLine();
                phoneSearch.filteredListing(string);
            }
            if(s.equals("x")){
                break;
            }
        }
    }
}
