
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
public class OneItemBox extends Box {
    
    private static final int CAPACITY = 1;
    private ArrayList<Item> list = new ArrayList<Item>();
    
    public OneItemBox() {
        
    }

    @Override
    public void add(Item item) {
        if(list.size() < 1) {
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
    
}
