import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map<Player, Integer> stats = new HashMap();

    public void andTheWinnerIs(Player player) {
        int score = stats.getOrDefault(player, 0);
        score += 1;
        stats.put(player, score);
    }

    public void print() {
        System.out.println("#########################");
        stats.forEach((player, score) -> {
            System.out.println(player.getName() + ": " + score);
        });
    }

    public void clear() {
        stats.clear();
    }

}
