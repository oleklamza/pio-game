import java.util.Random;

/**
 * Klasa reprezentująca gracza.
 */
public class Player {
    // mózg gracza odgadujący liczby
    private Random brain = new Random();

    /**
     * Konstruktory
     */
    public Player() {}

    public Player(String name) {
        setName(name);
    }

    /**
     * Imię gracza: pole, getter i setter.
     */
    private String name = "Domyślny Janusz";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    /**
     * Metoda "odgadująca" liczbę oczek wyrzuconą na kostce.
     *
     * @return liczb oczek (1-6)
     */
    public int guess() {
        return brain.nextInt(6) + 1;
    }

}