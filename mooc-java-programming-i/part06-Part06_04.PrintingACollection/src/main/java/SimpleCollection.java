
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            String allElements = "";
            
            for (String element: elements) {
                if (elements.size() > 1) {
                    allElements += element + "\n";
                } else {
                    allElements += element;
                }
            }
            
            if (elements.size() < 2) {
                return "The collection " + this.name + " has 1 element:" + "\n" + allElements;
            } else {
                return "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n" + allElements;
            }
        }
    }
    
}
