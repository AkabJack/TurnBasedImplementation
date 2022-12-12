package jpp.gametheory.generic;

import java.util.List;

public class Player<C extends IChoice> implements IPlayer<C> {
    private String name;
    private IStrategy strategie;
    
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
        throw new UnsupportedOperationException();
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
