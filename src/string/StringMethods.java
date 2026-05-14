package string;
import java.util.Scanner;
public class StringMethods {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        email = email.toLowerCase();

        if( !email.contains("@")) {
            System.out.println("You need to enter a valid email!");
        } else {
             username = email.substring(0, email.indexOf('@'));
             domain = email.substring(email.indexOf('@') + 1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain name is: " + domain);
        }



        scanner.close();
    }
}
