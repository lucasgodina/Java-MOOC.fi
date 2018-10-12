import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length = 0;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        int i = 0;
        while(true){
            if (i < length){
                int number = random.nextInt(26);
                char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
                password += symbol;
                i++;
            } else {
                break;
            }
        }

        return password;
    }
}
