package H.day5;

public class Task2 {
    public static void main(String[] args) {
        Moto moto = new Moto(2022, "Black", "Yamaha");

        System.out.println("Our bike is: " + moto.getModel() + " model " + moto.getYear() + " year " + moto.getColor() + " color");
    }
}
