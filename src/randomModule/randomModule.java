package randomModule;
import java.util.Random;
public class randomModule {
    static void main() {
        Random random = new Random();

        int randomNumber = random.nextInt(1, 11);
        double randomDecimal = random.nextDouble(1,6);
        boolean isHeads = random.nextBoolean();

        System.out.println("Random number: " + randomNumber);
        System.out.println("Random decimal: " + randomDecimal);
        System.out.println("Coin Flip: " + (isHeads ? "Heads" : "Tails"));
    }
}
