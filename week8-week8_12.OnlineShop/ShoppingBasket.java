import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (purchases.get(product) != null) {
            purchases.get(product).increaseAmount();
        } else {
            Purchase purchase = new Purchase(product, 1, price);
            purchases.put(product, purchase);
        }
    }

    public int price() {
        int total = 0;
        for (String purchase : purchases.keySet()) {
            total += purchases.get(purchase).price();
        }
        return total;
    }

    public void print() {
        for (String purchase : purchases.keySet()) {
            System.out.println(purchases.get(purchase));
        }
    }
}