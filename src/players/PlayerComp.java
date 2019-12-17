package players;

import java.util.Random;

public class PlayerComp extends Player {
    // mózg gracza odgadujący liczby
    private Random brain = new Random();

    public PlayerComp() {}

    public PlayerComp(String name) {
        super(name);
    }

    /**
     * Metoda "odgadująca" liczbę oczek wyrzuconą na kostce.
     *
     * @return liczb oczek (1-6)
     */
    @Override
    public int guess() {
        return brain.nextInt(6) + 1;
    }

}
