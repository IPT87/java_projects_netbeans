/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        history = new ChangeHistory();
        history.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return result;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + 
                           "\n" + "History: " + history() +
                           "\n" + "Largest amount of product: " + history.maxValue() + 
                           "\n" + "Smallest amount of product: " + history.minValue() + 
                           "\n" + "Average: " + history.average());
    }
    
    public String history() {
        return history.toString();
    }
    
}
