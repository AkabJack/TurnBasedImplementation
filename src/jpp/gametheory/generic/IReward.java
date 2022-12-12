package jpp.gametheory.generic;

/**
 * A class that implements this interface provides a yield function,
 * which can determine for each player how much win/loss they made in a given round.
 */
@FunctionalInterface
public interface IReward<C extends IChoice> {

    /**
     * Returns the yield made by the player in the round.
     * The higher the numerical value, the bigger the win.
     *
     * @param player Player to calculate profit for.
     * @param gameRound Round for which to calculate profit.
     *
     * @return profit for the player in the round.
     *
     * @throws IllegalArgumentException If the player didn't play in the round.
     */
    int getReward(IPlayer<C> player, IGameRound<C> gameRound);
}
