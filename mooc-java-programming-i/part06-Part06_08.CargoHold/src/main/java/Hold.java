
import java.util.ArrayList;

public class Hold {
    
    private int  maximumWeight;
    private int totalWeight = 0;
    private ArrayList<Suitcase> list;
    
    public Hold(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.list = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maximumWeight) {
            this.list.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase item: list) {
            item.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.list.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
