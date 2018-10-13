public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter counter = new Counter(10, true);
        counter.decrease();
        counter.decrease();
        System.out.println(counter.value());
        counter.increase();
        System.out.println(counter.value());
        counter.decrease(7);
        System.out.println(counter.value());
        counter.increase(3);
        System.out.println(counter.value());
        counter.decrease(10);
        System.out.println(counter.value());
    }
}
