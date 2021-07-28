
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class Box implements Packable {
    private double maximumCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        items = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if(packable.weight() + weight() <= getMaximumCapacity()) {
            items.add(packable);
        }
    }
    
    @Override
    public double weight() {
        return items.stream().mapToDouble(i -> i.weight()).sum();
    }

    public double getMaximumCapacity() {
        return maximumCapacity;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }

}
