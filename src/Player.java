import java.util.Random;

/**
 * Klasa reprezentująca gracza.
 */
public abstract class Player {
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
        } else {
            System.err.println("Nieprawidłowe imię");
        }
    }

    /**
     * Abstrakcyjna metoda implementowana w klasach potomnych.
     */
    public abstract int guess();
}