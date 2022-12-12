package jpp.gametheory.generic;

import java.util.ArrayList;
import java.util.List;

public class Player<C extends IChoice> implements IPlayer<C> {
    private String name;
    private IStrategy strategie;
    ArrayList<GameRound> rundeJucate;

    public Player(String name, IStrategy<C> strategy) {
        this.name = name;
        this.strategie = strategy;
    }
    
    @Override
    public String getName() {
       return name;
    }

    @Override
    public IStrategy<C> getStrategy() {
        return strategie;
    }

    @Override
    public C getChoice(List<IGameRound<C>> previousRounds) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(IPlayer<C> o) {
        // https://www.w3schools.com/java/ref_string_compareto.asp
        int comparatie = this.name.compareTo(o.getName());
        if(comparatie == 0) return 0;
        else if (comparatie < 0) return -1; 
        else return 1;
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }
}
