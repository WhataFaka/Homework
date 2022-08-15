package H.day3;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;

            switch (city) {
                case "Moscow":
                case "Rostov":
                case "Novosibirsk":
                    System.out.println("Russia");
                    break;

                case "Rome":
                case "Milan":
                case "Tourin":
                    System.out.println("Italy");
                    break;

                case "Berlin":
                case "Koln":
                case "Muncen":
                    System.out.println("Germany");
                    break;

                case "Liverpool":
                case "Manchester":
                case "London":
                    System.out.println("England");
                    break;
                default:
                    System.out.println("Not yes cities");
            }

        }
    }
}
