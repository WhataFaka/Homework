public class Arrays_of_String {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "Hello";
        strings[1] = "By";
        strings[2] = "wz-up";
        strings[3] = "fck u";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();

        int[] numbers = {1, 3, 5, 2};
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
