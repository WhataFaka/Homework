import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please ur ages: ");
        String age = scan.nextLine();
        switch (age) {
            case "null":
                System.out.println("U are born");
                break;
            case "seven":
                System.out.println("U are going to school");
                break;
            case "eighteen":
                System.out.println("U are going to the university");
                break;
            case "twenty seven":
                System.out.println("U DIED -_-");
                break;
            default:
                System.out.println("404 ERROR");
        }
    }
}
