import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<Integer>();
    }

    public void add(Integer i) {
        grades.add(i);
    }

    public void results() {
        ArrayList<Integer> five = new ArrayList<Integer>();
        ArrayList<Integer> four = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> zero = new ArrayList<Integer>();

        for(int grade : grades){
            if(grade >= 0 && grade <= 29){
                zero.add(grade);
            } else if (grade >= 30 && grade <= 34){
                one.add(grade);
            } else if (grade >= 35 && grade <= 39){
                two.add(grade);
            } else if (grade >= 40 && grade <= 44){
                three.add(grade);
            } else if (grade >= 45 && grade <= 49){
                four.add(grade);
            } else if (grade >= 50 && grade <= 60){
                five.add(grade);
            }
        }

        System.out.println("Grade distribution");
        System.out.print("5: ");
        printStars(five.size());
        System.out.println();
        System.out.print("4: ");
        printStars(four.size());
        System.out.println();
        System.out.print("3: ");
        printStars(three.size());
        System.out.println();
        System.out.print("2: ");
        printStars(two.size());
        System.out.println();
        System.out.print("1: ");
        printStars(one.size());
        System.out.println();
        System.out.print("0: ");
        printStars(zero.size());
        System.out.println();
    }

    public void acceptance() {
        double accepted = 0;
        for (int grade : grades) {
            if (grade > 29) {
                accepted++;
            }
        }
        double acceptancePercentage = (100 * accepted) / grades.size();

        System.out.print("Acceptance percentage: " + acceptancePercentage);
    }

    public void printStars(int i){
        while(i > 0){
            System.out.print("*");
            i--;
        }
    }
}
