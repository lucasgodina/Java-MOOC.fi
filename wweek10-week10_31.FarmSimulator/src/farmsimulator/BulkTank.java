package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public BulkTank() {
        this(2000);
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if(amount >= 0) {
            if (amount + this.volume >= capacity) {
                this.volume = capacity;
            } else {
                this.volume += amount;
            }
        }
    }

    public double getFromTank(double amount){
        if(amount >= 0){
            if(this.volume - amount <= 0){
                amount = this.volume;
                this.volume = 0;
                return amount;
            } else {
                this.volume -= amount;
                return amount;
            }
        }
        return 0.0;
    }

    public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
