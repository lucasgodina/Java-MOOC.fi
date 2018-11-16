package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean status;

    public Thermometer(){
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public int measure() {
        if(isOn()){
            Random random = new Random();
            return -30 + random.nextInt(30 - (-30) + 1);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public void on() {
        this.status = true;
    }
}
