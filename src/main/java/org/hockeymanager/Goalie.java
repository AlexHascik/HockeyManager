package org.hockeymanager;

public class Goalie extends Player{

    private int wins;

    public Goalie(String name, int age, int wins){
        super(name, age, Position.GOALIE);
        validateNonNegative("Wins", wins);
        this.wins = wins;
    }

    public int getWins(){
        return wins;
    }

    public void setWins(int wins){
        validateNonNegative("Wins", wins);
        this.wins = wins;
    }

}
