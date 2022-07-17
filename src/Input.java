import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int x = s.nextInt();
        System.out.println("Ваша дата: " + x);
    }
}
