package H.day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            string += i + " ";
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
//        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder("");

        long start1 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }

        long end1 = System.currentTimeMillis();

        System.out.println(end1 - start1);
//        System.out.println(stringBuilder);
    }
}
