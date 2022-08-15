package H.day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2022);
        car.setModel("BMW M5 COMPETITION");
        car.setColor("Blue");

        Moto moto = new Moto(2022,"Red","HONDA");

        car.info();
        moto.info();

        System.out.println(car.yearDifference(2012));
        System.out.println(moto.yearDifference(2006));
    }
}
