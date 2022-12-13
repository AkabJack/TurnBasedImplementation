package jpp.gametheory.generic;

import java.util.*;

public class Game<C extends IChoice> {
    private Set<IPlayer<C>> jucatori;

    public Game(Set<IPlayer<C>> players, IReward<C> reward) {
        this.jucatori = players;

    }

    public Set<IPlayer<C>> getPlayers() {
        return jucatori;
    }

    public IGameRound<C> playRound() {
        Map<String,String> mutare = new HashMap<String,String>();
        String data = "";
        Scanner consola = new Scanner(System.in);

        for(IPlayer jucator : jucatori){
            System.out.println("E randul lui: " + jucator.getName());
            data = consola.nextLine();
            mutare.put(jucator.getName(), data);
        }
        //TODO Rezolva asta
    }

    public void playNRounds(int n) {
        throw new UnsupportedOperationException();
    }

    public Optional<IGameRound<C>> undoRound() {
        throw new UnsupportedOperationException();
    }

    public void undoNRounds(int n) {
        throw new UnsupportedOperationException();
    }

    public List<IGameRound<C>> getPlayedRounds() {
        throw new UnsupportedOperationException();
    }

    public int getPlayerProfit(IPlayer<C> player) {
        throw new UnsupportedOperationException();
    }

    public Optional<IPlayer<C>> getBestPlayer() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }
}
