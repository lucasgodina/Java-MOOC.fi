import java.util.*;

public class Storehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;

    public Storehouse() {
        productPrices = new HashMap<String, Integer>();
        productStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        if (price >= 0 && stock >= 0) {
            productPrices.put(product, price);
            productStock.put(product, stock);
        }
    }

    public int price(String product) {
        if (productPrices.get(product) == null) {
            return -99;
        } else {
            return productPrices.get(product);
        }
    }

    public int stock(String product) {
        if(productStock.get(product) == null){
            return 0;
        }
        return productStock.get(product);
    }

    public boolean take(String product) {
        if (stock(product) == 0 || productStock.get(product) == null) {
            return false;
        } else {
            productStock.put(product, productStock.get(product) - 1);
            return true;
        }
    }

    public Set<String> products(){
        Set<String> set = new HashSet<String>();

        for (String key : productStock.keySet()){
            set.add(key);
        }

        return set;
    }
}
