
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!owners.isEmpty() && owners.containsKey(licensePlate)) {
            return false;
        } else {
            owners.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        if (!owners.isEmpty() && owners.containsKey(licensePlate)) {
            return owners.get(licensePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        owners.keySet().forEach((licensePlate) -> {
            System.out.println(licensePlate);
        });
    }
    
    public void printOwners() {
        ArrayList<String> namesOfOwners = new ArrayList<>();
        
        owners.values().stream().filter((name) -> (!namesOfOwners.contains(name))).map((name) -> {
            System.out.println(name);
            return name;
        }).forEachOrdered((name) -> {
            namesOfOwners.add(name);
        });
    }
}
