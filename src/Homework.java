import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        Random random = new Random();
        int milkAmount = random.nextInt(1000); // ml
        int powderAmount = random.nextInt(30); // g
        int eggsCount = random.nextInt(10); // items
        int sugarAmount = random.nextInt(500); // g
        int oilAmount = random.nextInt(50); // ml
        int appleCount = random.nextInt(10); // items

        System.out.println(milkAmount);
        System.out.println(powderAmount);
        System.out.println(eggsCount);
        System.out.println(sugarAmount);
        System.out.println(oilAmount);
        System.out.println(appleCount);

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        }

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 5 && sugarAmount >= 3 && milkAmount >= 100 && oilAmount >= 30) {
            System.out.println("Pancakes");
        }


        // milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        }

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        }
    }
}