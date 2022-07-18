import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int result = 1;
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            result = result * i;
            System.out.println(i);
        }
        System.out.println("Factrorial =" + " " + result);
    }
}
