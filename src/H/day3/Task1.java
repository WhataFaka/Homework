package H.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country){
            case "Moscow","Rostov","Vladivostok":
                System.out.println("This is Russia");
            break;
            case "Rome","Milan","Tourin":
                System.out.println("This is Italy");
            break;
            case "Berlin","Koln","Muncen":
                System.out.println("This is Germany");
            break;
            default:
                System.out.println("Not yes cities");
        }
    }
}
