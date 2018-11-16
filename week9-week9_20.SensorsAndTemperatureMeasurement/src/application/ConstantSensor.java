package application;

public class ConstantSensor implements Sensor {
    private int sensor;

    public ConstantSensor(int sensor){
        this.sensor = sensor;
    }

    @Override
    public void on(){
    }

    @Override
    public void off(){
    }

    @Override
    public int measure() {
        return this.sensor;
    }

    @Override
    public boolean isOn() {
        return true;
    }
}
