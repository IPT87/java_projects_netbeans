
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> list = new ArrayList<>();
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int itemsWeight = list.stream().mapToInt(w -> w.getWeight()).sum();
        if(item.getWeight() + itemsWeight <= capacity) {
            list.add(item);
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        if(list.contains(item)) {
            return true;
        } else {
            return false;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
