package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int measure() {
        int sum = 0;
        int amount = 0;
        if (isOn() == false) {
            throw new IllegalStateException();
        } else {
            for (Sensor sensor : sensors) {
                amount++;
                sum += sensor.measure();
            }
        }

        int average = sum / amount;
        readings.add(average);

        return average;
    }


    public List<Integer> readings() {
        return readings;
    }
}
