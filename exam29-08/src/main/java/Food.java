
public class Food {
    private String name;
    private int cookingTime;
    
    public Food(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
    
    public int getCookingTime() {
        return cookingTime;
    }
    
    @Override
    public String toString() {
        return name + ", " + cookingTime;
    }
}
