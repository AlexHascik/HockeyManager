package org.hockeymanager;

public class Forward extends Player {

    private int goals;

    public Forward(String name, int age, int goals){
        super(name, age, Position.FORWARD);
        validateNonNegative("Goals", goals);
        this.goals = goals;
    }

    public int getGoals(){
        return goals;
    }

    public void setGoals(int goals){
        validateNonNegative("Goals", goals);
        this.goals = goals;
    }

}
