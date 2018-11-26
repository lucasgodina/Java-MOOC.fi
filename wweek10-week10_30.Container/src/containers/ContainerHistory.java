package containers;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public double maxValue() {
        if (history.size() == 0) {
            return 0.0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (history.size() == 0) {
            return 0.0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (history.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;

        for (double current : history) {
            sum += current;
        }

        return sum / history.size();
    }

    public double greatestFluctuation() {
        if (history.isEmpty() || history.size() == 1) {
            return 0.0;
        } else {
            double max = 0;
            int i = 0;
            for( double d : history){
                double d1 = history.get(i + 1);
                double maxTemp = Math.abs(d - d1);
                if(maxTemp > max){
                    max = maxTemp;
                }

                i++;
                if(i >= (history.size() - 1)){
                    break;
                }
            }
            return max;
        }

    }

    public double variance() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0.0;
        } else {
            double average = this.average();
            double i = 0;
            for (double x : this.history) {
                i += (x - average) * (x - average);
            }

            return i / (history.size() - 1);
        }
    }

    public String toString() {
        return history.toString();
    }
}
