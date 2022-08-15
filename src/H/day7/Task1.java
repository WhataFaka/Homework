package H.day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("S7",2020,200,102220);
        Airplane airplane2 = new Airplane("Boeing",2010,200,30000);

        airplane2.setLength(500);

        Airplane.compareAirplanes(airplane1,airplane2);
    }
}
