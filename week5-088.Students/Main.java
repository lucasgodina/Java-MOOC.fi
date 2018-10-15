
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while(true){
            System.out.print("name: ");
            String n = reader.nextLine();
            if(n.equals("")){
                break;
            } else {
                System.out.print("studentnumber: ");
                String sn = reader.nextLine();

                Student student = new Student(n, sn);
                students.add(student);
            }
        }

        for(Student student : students){
            System.out.println(student);
        }

        System.out.print("Give search term: ");
        String s = reader.nextLine();
        System.out.println("Result:");
        for(Student student : students){
            if(student.getName().contains(s)){
                System.out.println(student);
            }
        }
    }
}
