import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        do {
            System.out.println("Please 5!");
            value=scan.nextInt();
        } while (value!=5);
        System.out.println("U GOT THIS");
    }
}
