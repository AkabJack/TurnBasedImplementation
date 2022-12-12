package jpp.gametheory.generic;

import java.util.List;

/**
 * A class that implements this interface embodies a particular strategy that a player can pursue in a {@code C} type game.
 */
public interface IStrategy<C extends IChoice> {

    /**
     * Returns the name of the strategy.
     * @return Strategy name.
     */
    String name();

    /**
     * Issues the next turn for a player. To do this, the method gets a list of all the rounds played so far
     * hand over.
     * @param player Player for which the next turn should be given.
     * @param previousRounds List of all rounds played so far. The last round comes last.
     * @return Player's decision for the next round.
     */
    
    C getChoice(IPlayer<C> player, List<IGameRound<C>> previousRounds);
}
