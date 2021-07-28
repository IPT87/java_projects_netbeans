
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxTotalWeight;
    private int itemsWeight = 0;

    public Suitcase(int maxTotalWeight) {
        this.items = new ArrayList<>();
        this.maxTotalWeight = maxTotalWeight;
    }

    public void addItem(Item item) {
        if (itemsWeight + item.getWeight() <= maxTotalWeight) {
            this.items.add(item);
            itemsWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return this.itemsWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item: this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    } 

    @Override
    public String toString() {

        String output = "";

        if (this.items.isEmpty()) {
            output = "no items (0 kg)";
        } else {
            if (this.items.size() == 1) {
                output = this.items.size() + " item (" + this.itemsWeight + " kg)";
            } else {
                output = this.items.size() + " items (" + this.itemsWeight + " kg)";
            }
        }
        return output;
    }
}
