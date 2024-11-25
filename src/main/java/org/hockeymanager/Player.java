package org.hockeymanager;

public abstract class Player {

    public static final int MIN_PLAYER_AGE = 5; // Min valid age
    public static final int MAX_PLAYER_AGE = 100; // Max valid age
    private String name;
    private int age;

    private Position position;

    public Player(String name, int age, Position position){
        // Name validation
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        // Age validation
        if(age < MIN_PLAYER_AGE || age > MAX_PLAYER_AGE){
            throw new IllegalArgumentException("Age must be between " + MIN_PLAYER_AGE + " and " + MAX_PLAYER_AGE);
        }

        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Position getPosition(){
        return position;
    }

    protected static void validateNonNegative(String name, int value){
        if(value < 0){
            throw new IllegalArgumentException(name + " cannot be negative");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

