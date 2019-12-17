package statistics;

import players.Player;

import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics {

    private Map<Player, Integer> stats = new HashMap();

    @Override
    public void andTheWinnerIs(Player player) {
        int score = stats.getOrDefault(player, 0);
        score += 1;
        stats.put(player, score);
    }

    @Override
    public void print() {
        System.out.println("#########################");
        stats.forEach((player, score) -> {
            System.out.println(player.getName() + ": " + score);
        });
    }

    @Override
    public void clear() {
        stats.clear();
    }

}
