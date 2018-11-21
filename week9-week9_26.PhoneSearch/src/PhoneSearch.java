import java.util.*;

public class PhoneSearch {
    private Map<String, ArrayList<String>> contacts;
    private Map<String, String> contactAddress;

    public PhoneSearch() {
        this.contacts = new HashMap<String, ArrayList<String>>();
        this.contactAddress = new HashMap<String, String>();
    }

    public void add(String name, String number) {
        if (contacts.get(name) == null) {
            contacts.put(name, new ArrayList<String>());
        }
        contacts.get(name).add(number);
    }

    public Set<String> searchByPerson(String name) {
        Set<String> numbers = new HashSet<String>();
        if (contacts.get(name) == null) {
            numbers.add("not found");
        } else {
            for (String number : contacts.get(name)) {
                numbers.add(number);
            }
        }
        return numbers;
    }

    public String searchByNumber(String number) {
        for (String name : contacts.keySet()) {
            if (contacts.get(name).contains(number)) {
                return name;
            }
        }
        return " not found";
    }

    public void addAddress(String name, String street, String city) {
        contactAddress.put(name, street + " " + city);
    }

    public void informationSearch(String name) {
        if (contactAddress.get(name) == null && contacts.get(name) == null) {
            System.out.println("  not found");
        } else {
            if (contactAddress.get(name) == null) {
                System.out.println("  address unknown");
            } else {
                System.out.println("  address: " + contactAddress.get(name));
            }
            if (contacts.get(name) == null) {
                System.out.println("  phone number not found");
            } else {
                System.out.println("  phone numbers:");
                for (String number : contacts.get(name)) {
                    System.out.println("   " + number);
                }
            }
        }
    }

    public void deleteInformation(String name) {
        contactAddress.remove(name);
        contacts.remove(name);
    }

    public void filteredListing(String string) {
        ArrayList<String> found = new ArrayList<String>();
        for (String name : contacts.keySet()) {
            if (name.contains(string)) {
                found.add(name);
            }
        }

        for (String name : contactAddress.keySet()) {
            if (contactAddress.get(name).contains(string) && !found.contains(string)) {
                found.add(name);
            }
        }
        if(found.isEmpty()){
            System.out.println(" keyword not found");
        } else {
            Collections.sort(found);
            for(String name : found){
                System.out.println(" " + name);
                informationSearch(name);
            }
        }
    }
}