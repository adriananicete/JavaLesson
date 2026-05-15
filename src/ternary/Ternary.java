package ternary;
import java.util.Random;
public class Ternary {
    public static void main(String[] args) {
        Random random = new Random();

        int hours = random.nextInt(1,14);
        String timeOfDay = (hours < 12) ? hours + "am" : hours + "pm";

        int score = random.nextInt(60, 90);
        String status = (score <= 75) ? score + " Status: Failed" : score + " Status: Pass";

        int age = random.nextInt(13, 25);
        String ageCheck = (age >= 18) ? age + " is Legal age" : age + " is Minor age";



        System.out.println(timeOfDay);
        System.out.println(status);
        System.out.println(ageCheck);
    }
}
