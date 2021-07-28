
public class Container {
    private int liquid = 0;
    
    public Container() {
        
    }
    
    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }
    
    public int contains() {
        return liquid;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            if (liquid + amount <= 100) {
                liquid += amount;
            } else {
                liquid = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (liquid - amount >= 0) {
                liquid -= amount;
            } else {
                liquid = 0;
            }
        }
    }
    
    @Override
    public String toString() {
        return liquid + "/100";
    }
}
