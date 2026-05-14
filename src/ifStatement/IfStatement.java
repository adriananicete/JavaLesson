package ifStatement;
import java.util.Scanner;
public class IfStatement {
    static void main() {
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent) {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price = price * 0.7;

            } else {
                System.out.println("You get a student discount of 10%");
                price = price * 0.9;

            }

        } else {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                price = price * 0.8;

            }

            price = price * 1;


        }

        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}
