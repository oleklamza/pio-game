package players;

import java.util.Scanner;

/**
 *
 */
public class PlayerHuman extends Player {

    private Scanner cin = new Scanner(System.in);

    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }

    /**
     * Metoda "odgadująca" -- liczba podawana w konsoli.
     *
     * @return
     */
    @Override
    public int guess() {
        System.out.print("Wpisz liczbę (1-6): ");
        return cin.nextInt();
    }

}