
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person shortest = list.get(0);
        
        for (Person element: list) {
            if (shortest.getHeight() > element.getHeight()) {
                shortest = element;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person shortest = shortest();
        
        this.list.remove(shortest());
        
        return shortest;
    }
}
