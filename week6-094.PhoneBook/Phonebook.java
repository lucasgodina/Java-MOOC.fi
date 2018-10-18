import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.contacts.add(person);
    }

    public void printAll() {
        for (Person person : contacts) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : contacts) {
            if (person.getName().equals(name)) {
                return (person.getNumber());
            }
        }
        return "number not known";
    }
}
