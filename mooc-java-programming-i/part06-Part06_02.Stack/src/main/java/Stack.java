
import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack;
    
    public Stack() {
        stack = new ArrayList<String>();
    }
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public void add(String value) {
        this.stack.add(0, value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        String output = this.stack.get(0);
        
        this.stack.remove(0);
        
        return output;
    }
    
}
