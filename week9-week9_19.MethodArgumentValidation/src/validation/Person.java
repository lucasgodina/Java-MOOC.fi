package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.equals("") || name.length() > 40){
            throw new IllegalArgumentException("You must enter a name");
        }
        this.name = name;
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("The age has to be between 0-120");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
