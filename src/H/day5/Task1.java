package H.day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("green");
        car.setModel("Tesla model X");
        car.setYear(2018);


        System.out.println("Our car is: " + car.getModel() + " color:" + car.getColor() + " " + car.getYear() + " year");
    }
}
