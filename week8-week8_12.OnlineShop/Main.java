import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write some test code here
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        System.out.println(basket.price());
        basket.add("butter", 5);
        System.out.println(basket.price());
    }
}
