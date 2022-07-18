import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        for (int i = 0; i <= value; i++) {
            for (int k = 0; k <= value; k++) {
                if (value == k * i) {
                    System.out.println(k + " " + i);
                }
            }
        }
    }
}
