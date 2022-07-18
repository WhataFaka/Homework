public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int volumeNow = 0;
        int x=0;

        while (volumeNow<=volume) {
            volumeNow = (volumeNow + fillingSpeed) - devastationSpeed;
            x++;
        }
        System.out.println(x);
    }
}