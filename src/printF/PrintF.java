package printF;

public class PrintF {
    static void main() {
        String name = "Adrian";
        int age = 30;
        int price = 1000;
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        boolean isEmployed = false;
        String country = "Philippines";

        System.out.printf("%s is %d years old. He is from %s\n", name ,age, country);
        System.out.printf("is he/she Employed? %b\n", isEmployed);
        System.out.printf("Your price is: %,d\n", price);
        System.out.printf("%4d", id1);
        System.out.printf("%-4d\n", id1);
        System.out.printf("%4d", id2);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%4d", id3);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%4d", id4);
        System.out.printf("%-4d\n", id4);
    }
}
