
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
public class Hideout<T> {
    
    private ArrayList<T> hideout;
    
    public Hideout() {
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if (isInHideout()) {
            this.hideout.clear();
            this.hideout.add(toHide);
        } else {
            this.hideout.add(toHide);
        }
    }
    
    public T takeFromHideout() {
        if (isInHideout()) {
            T t = this.hideout.get(0);
            this.hideout.clear();
            return t;
        } else {
            return null;
        }
    }
    
    public boolean isInHideout() {
        return !this.hideout.isEmpty();
    }
    
}
