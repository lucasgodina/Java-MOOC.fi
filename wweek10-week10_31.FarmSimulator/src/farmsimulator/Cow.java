package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private String name;
    private int capacity;
    private double amount;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private Random random = new Random();

    public Cow(String name){
        this.name = name;
        this.capacity = 15 + random.nextInt(40 - 15) + 1;
        this.amount = 0.0;
    }

    public Cow(){
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.capacity = 15 + random.nextInt(40 - 15) + 1;
        this.amount = 0.0;
    }

    public String getName(){
        return this.name;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getAmount(){
        return this.amount;
    }

    @Override
    public double milk(){
        double milk = getAmount();
        this.amount = 0.0;
        return milk;
    }

    @Override
    public void liveHour(){
        double milk = 0.7 + Math.random()*(2.0 - 0.7);
        this.amount += Math.ceil(milk);
    }

    @Override
    public String toString(){
        return this.name + " " + this.milk() + "/" + this.capacity;
    }
}
