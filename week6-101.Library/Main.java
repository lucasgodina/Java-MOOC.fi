public class Main {
    public static void main(String[] args) {
        // test your program here
        Library k = new Library();
        Book a = new Book("Core Java", "Addison Wesley", 2001);
        Book b = new Book("Java PowerUser", "Prentice Hall", 2012);
        k.addBook(a);
        k.addBook(b);

        System.out.println(k.searchByTitle("Java"));
        System.out.println(k.searchByPublisher("Prentice"));
    }
}
