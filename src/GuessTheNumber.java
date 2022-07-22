import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(100) + 1;
        System.out.println(value);
        int attempt = 0;
        while (value != attempt) {
            attempt = new Scanner(System.in).nextInt();

            if (attempt == value) {
                System.out.println("U right " + attempt);
            } else if (attempt > value) {
                System.out.println("This number > value");
            } else {
                System.out.println("This number < value");
            }
        }
    }
}
