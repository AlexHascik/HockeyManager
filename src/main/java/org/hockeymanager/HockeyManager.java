package org.hockeymanager;

import java.util.ArrayList;
import java.util.List;

public class HockeyManager {
    private List<Player> players;
    public HockeyManager(){
        players = new ArrayList<>();
    }
    public void addNewForward(String name, int age, int goals){
        players.add(new Forward(name, age, goals));
    }
    public void addNewDefender(String name, int age, int hits){
        players.add(new Defender(name, age, hits));
    }
    public void addNewGoalie(String name, int age, int wins){
        players.add(new Goalie(name, age, wins));
    }

    public List<Player> getPlayers(){
        return players;
    }
    public void printNameAndAgeOfTheYoungestPlayer(){
        int teamSize = players.size();
        if(teamSize == 0){
            System.out.println("There are no players in the team");
            return;
        }

        int minAge = Integer.MAX_VALUE;
        int idx = 0;
        for(int i =0; i < teamSize; i++){
            int age = players.get(i).getAge();
            if(age < minAge){
                minAge = age;
                idx = i;
            }
        }
        System.out.println(players.get(idx));
    }

    //Since we track only the age of the players, there can be multiple youngest players
    public void printAllYoungestPlayers(){

        if(players.isEmpty()){
            System.out.println("There are no players in the team");
            return;
        }

        int minAge = Integer.MAX_VALUE;

        //Find the youngest age among players
        for(Player player : players){
            int age = player.getAge();
            if(age < minAge){
                minAge = age;
            }
        }

        for(Player player : players){
            if(player.getAge() == minAge){
                System.out.println(player);
            }
        }
    }
}