import java.util.Random;

/**
 * Klasa reprezentująca gracza.
 */
public class Player {
    // mózg gracza odgadujący liczby
    private Random brain = new Random();

    /**
     * Metoda "odgadująca" liczbę oczek wyrzuconą na kostce.
     *
     * @return liczb oczek (1-6)
     */
    public int guess() {
        return brain.nextInt(6) + 1;
    }

}