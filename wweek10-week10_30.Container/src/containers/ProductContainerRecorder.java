package containers;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.history = new ContainerHistory();
        history.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }

    public String history(){
         return history.toString();
    }

    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        history.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount){
        double take = super.takeFromTheContainer(amount);
        history.add(super.getVolume());
        return take;
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history);
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
}
