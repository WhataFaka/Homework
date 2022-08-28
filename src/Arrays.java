import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int number = 10; // примитивный тип данных //[10]
        int[] numbers = new int[5]; // numbers --> [массив] ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        for (int i =0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("");
        int[] numbers1 = {1,5,6,8,44};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }

    public static boolean toString(String[] numbers) {
        return false;
    }
}
