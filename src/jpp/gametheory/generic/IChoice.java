package jpp.gametheory.generic;


/**
 * A class that implements this interface,
 * represents one possible move a player can make in a turn.
 * It's a good idea to implement this as {@code enum} later.
 */
public interface IChoice {

   
    /**
     * Returns the name of the move/decision.
     * @return Name of move/decision.
     */
    String name();
}
