package org.hockeymanager;

public class Defender extends Player{

    private int hits;

    public Defender(String name, int age, int hits){
        super(name, age, Position.DEFENDER);
        validateNonNegative("Hits", hits);
        this.hits = hits;
    }

    public int getHits(){
        return hits;
    }

    public void setHits(int hits){
        validateNonNegative("Hits", hits);
        this.hits = hits;
    }

}
