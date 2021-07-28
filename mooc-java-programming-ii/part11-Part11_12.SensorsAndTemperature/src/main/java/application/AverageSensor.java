/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author MrIbi
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings = new ArrayList<>();
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        return sensors.stream().noneMatch((sensor) -> (sensor.isOn() == false));
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.get(0).setOff();
    }

    @Override
    public int read() {
        if (this.isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        this.readings.add((int)this.sensors.stream().mapToDouble(sensor -> sensor.read()).average().getAsDouble());
        
        return (int)this.sensors.stream().mapToDouble(sensor -> sensor.read()).average().getAsDouble();
    }
    
}
