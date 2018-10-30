public class Calculator {
    private Reader reader;
    private int statistics;

    public Calculator(){
        this.reader = new Reader();
        this.statistics = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.println();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println();
        int sum = value1 + value2;

        System.out.println("sum of the values: " + sum);
        this.statistics++;
    }

    private void product(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.println();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println();
        int product = value1 * value2;

        System.out.println("product of the values: " + product);
        this.statistics++;
    }

    private void difference(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.println();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println();
        int difference = value1 - value2;

        System.out.println("difference of the values: " + difference);
        this.statistics++;
    }

    private void statistics(){
        System.out.print("Calculations done: " + this.statistics);
    }
}
