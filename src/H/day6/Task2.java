package H.day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2006, 200, 5555);


        airplane.fillUp(150);

        airplane.info();

        airplane.setProducer("S7");
        airplane.setYear(2020);
        airplane.setLength(800);
        airplane.setWeight(8000);

        airplane.fillUp(800);
        airplane.info();

    }
}
