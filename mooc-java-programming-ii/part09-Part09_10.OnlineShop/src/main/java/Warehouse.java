
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> stockBalance;
    
    public Warehouse() {
        products = new HashMap<>();
        stockBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stockBalance.put(product, stock);
    }
    
    public int price(String product) {
        if(products.containsKey(product)) {
            return products.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if(products.containsKey(product)) {
            return stockBalance.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if(products.containsKey(product) && stockBalance.get(product) > 0) {
            stockBalance.replace(product, (stockBalance.get(product) - 1));
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        return products.keySet();
    }
    
}
