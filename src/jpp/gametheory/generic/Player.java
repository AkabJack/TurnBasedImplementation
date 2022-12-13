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
       return null;
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
        if(this == o){
            return true; 
        }
        else return  false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();//TODO lucreaza la asta
    }   

    @Override
    public String toString() {
        /*
         * Last in, first out (LIFO) is a method used to account for inventory that records the most recently produced items as sold first.
         */
        return name;
    }
}
