import java.util.Scanner;
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String city;
        String country;
        String programmingLanguage;
        String hobby;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your city: ");
        city = scanner.nextLine();

        System.out.print("Enter your country: ");
        country = scanner.nextLine();

        System.out.println("Enter your programming language: ");
        programmingLanguage = scanner.nextLine();

        System.out.println("Enter your hobby: ");
        hobby = scanner.nextLine();

        System.out.println("Hello, I'am " + name + ", " + age + " years old.");
        System.out.println("I lived in " + city + ", " + country + ".");
        System.out.println("I love " + hobby + " and my programming language that I use is " + programmingLanguage);


        scanner.close();
    }
}