
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account lucasAccount = new Account("Lucas' account", 100.0);
        lucasAccount.deposit(20.0);
        System.out.println(lucasAccount);
    }

}
