import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Player> players = new ArrayList();

    private Random rand = new Random();     //obiekt losujący

    public void addPlayer(Player player) {
        if (!nameExists(player.getName())) {
            players.add(player);
        } else {
            player.setName(player.getName() + rand.nextInt(10));
            addPlayer(player);
        }
    }

    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void play() {
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza

        boolean repeat;

        do {
            System.out.println("---------------------");

            repeat = true;

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess(); // odgadywanie zlecamy obiektowi klasy Player
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    System.out.println("BRAWO!");
                    repeat = false;
                }
            }

        } while (repeat);

    }

}
