
import java.util.ArrayDeque;
import java.util.Deque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class Pipe<T> {
    
    private Deque<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayDeque<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipe.addLast(value);
    }
    
    public T takeFromPipe() {
        return this.pipe.pollFirst();
    }
    
    public boolean isInPipe() {
        return !this.pipe.isEmpty();
    }
    
}
