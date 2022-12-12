package jpp.gametheory.generic;

import java.util.List;

/**
 * Represents a player in a game pursuing a specific strategy.
 * Two players should be able to be compared by their name,
 * where to sort in ascending alphabetical order.
 */
public interface IPlayer<C extends IChoice> extends Comparable<IPlayer<C>> {

    /**
     * Prints the player's name.
     * @return Name of the player.
     */
    String getName();

    
    /**
     * Outputs the player's strategy.
     * @return strategy of the player.
     */
    IStrategy<C> getStrategy();

    
    /**
     * Returns the choice of turn for the next turn for this player. All rounds played so far are handed over.
     * @param previousRounds Rounds played so far. If no rounds have been played yet, an empty list should be passed.
     * @return Choice of player for the next round.
     */
    C getChoice(List<IGameRound<C>> previousRounds);
}
