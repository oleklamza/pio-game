import java.util.Random;

public class Game {

    private Player player;
    private Random rand = new Random();     //obiekt losujący

    public void addPlayer(Player player) {
        this.player = player;
    }

    public void play() {
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess(); // odgadywanie zlecamy obiektowi klasy Player
            System.out.println("Gracz " + player.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }

        } while (number != guess);

        System.out.println("BRAWO!");
    }

}
