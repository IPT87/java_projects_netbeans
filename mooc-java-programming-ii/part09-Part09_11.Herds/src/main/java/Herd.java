
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class Herd implements Movable {
    
    private List<Movable> movables;
    
    public Herd() {
        this.movables = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Movable movable : movables) {
            result.append(movable.toString()).append("\n");
        }
        return result.toString();
    }
    
}
