
import java.util.ArrayList;

public class Kitchen {
    ArrayList<Food> allOrders = new ArrayList<>();
    
    public void addOrder(Food order) {
        allOrders.add(order);
    }
    
    public ArrayList<Food> orders() {
        return allOrders;
    }
    
    public int cookShortest() {
        int time = getShortestCookingTime(allOrders);
        
        for (Food order : allOrders) {
            if (order.getCookingTime() == time) {
                time = order.getCookingTime();
                allOrders.remove(order);
                break;
            }
        }
        
        return time;
    }
    
    public int cookByName(String name) {
        ArrayList<Food> list = (ArrayList<Food>) allOrders.clone();
        int time = 0;
        
        for (Food order : list) {
            if (order.getName().equals(name)) {
                time += order.getCookingTime();
                allOrders.remove(order);
            }
        }
        
        return time;
    }
    
    private int getShortestCookingTime(ArrayList<Food> list) {
        int shortestTime = Integer.MAX_VALUE;
        
        for (Food order : list) {
            if (order.getCookingTime() < shortestTime) {
                shortestTime = order.getCookingTime();
            }
        }
        
        return shortestTime;
    }
}
