package statistics;

import players.Player;

public class NullStatistics implements Statistics {
    @Override
    public void andTheWinnerIs(Player player) {}

    @Override
    public void print() {}

    @Override
    public void clear() {}
}
