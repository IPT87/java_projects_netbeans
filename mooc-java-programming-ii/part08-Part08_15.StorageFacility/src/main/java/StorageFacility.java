
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility() {
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        units.putIfAbsent(unit, new ArrayList<>());
        units.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return units.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        units.get(storageUnit).remove(item);
        
        if (units.get(storageUnit).isEmpty()) {
            units.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> itemsNames = new ArrayList<>();
        
        for (Map.Entry<String, ArrayList<String>> entry : units.entrySet()) {
            if (entry.getValue().size() > 0) {
                itemsNames.add(entry.getKey());
            }
        }
        
        return itemsNames;
    }
    
}
