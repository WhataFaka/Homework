import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson36 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("C:" + separator + "Users" + separator + "zenke" + separator + "Desktop" + separator + "test.txt");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
