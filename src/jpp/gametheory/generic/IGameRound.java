package jpp.gametheory.generic;

import java.util.Map;
import java.util.Set;

/**
 * A class that implements this interface represents a round of a particular game
 * and saves the moves made by each player.
 *
 */
public interface IGameRound<C extends IChoice> {

   /**
     * Returns the assignment player -> decision/move in this round.
     * Note that no changes can be made to instances of the class from outside.
     * @return Allocation of players to their stereotypes.
     */
    Map<IPlayer<C>, C> getPlayerChoices();

   /**
     * Returns a player's turn that turn.
     * @param player Player to spend the turn on this round.
     * @return player's move.
     * @throws IllegalArgumentException if the player didn't play in the round.
     */
    C getChoice(IPlayer<C> player);

    
    /**
     * Returns a set of all players in that round.
     * @return Set of players of this round.
     */
    Set<IPlayer<C>> getPlayers();

    /**
     * Returns all other players of this round to a player.
     * @param player Player for which the other players are searched.
     * @return set of all other players.
     * @throws IllegalArgumentException if the player didn't play in the round.
     */
    Set<IPlayer<C>> getOtherPlayers(IPlayer<C> player);

}
