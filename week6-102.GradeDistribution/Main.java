import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int i = scanner.nextInt();
            if (i == -1) {
                break;
            } else {
                if (i >= 0 && i <= 60) {
                    grades.add(i);
                }
            }
        }

        grades.results();
        grades.acceptance();
    }
}
