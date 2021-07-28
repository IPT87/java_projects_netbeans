
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrIbi
 */
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        } else {
            double maxValue = 0.0;
            for (double value : history) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            return maxValue;
        }
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        } else {
            double minValue = Double.MAX_VALUE;
            for (double value : history) {
                if (value < minValue) {
                    minValue = value;
                }
            }
            return minValue;
        }
    }
    
    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        } else {
            double sum = 0.0;
            for (double value : history) {
                sum += value;
            }
            return sum / history.size();
        }
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
}
