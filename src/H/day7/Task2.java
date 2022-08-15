package H.day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(100);
        Player player2 = new Player(90);
        Player player3 = new Player(96);

        Player.info();

        Player player4 = new Player(94);
        Player player5 = new Player(92);
        Player player6 = new Player(90);

        Player.info();

        Player player7 = new Player(95);
        System.out.println(player7.getStamina());

        Player.info();

        for (int i = 0; i<90;i++)
            player2.run();

        Player.info();

        Player player8 = new Player(99);

        Player.info();

    }
}
