
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        
        if (!(object instanceof Item)) {
            return false;
        }
        
        Item item = (Item) object;
        
        if (this.id.equals(item.id)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}
