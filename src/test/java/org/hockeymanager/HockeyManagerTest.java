package org.hockeymanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class HockeyManagerTest {
    private HockeyManager manager;

    @BeforeEach
    void setUp(){
        manager = new HockeyManager();
    }

    @Test
    void testAddNewForward(){
        manager.addNewForward("Player", 15, 9);
        assertEquals(1, manager.getPlayers().size());
    }
    @Test
    void testAddNewDefender(){
        manager.addNewDefender("Player", 17, 5);
        assertEquals(1, manager.getPlayers().size());
    }
    @Test
    void testAddNewGoalie(){
        manager.addNewGoalie("Player", 5, 0);
        assertEquals(1, manager.getPlayers().size());
    }

    @Test
    void testAddMultiplePlayers(){
        manager.addNewForward("Juraj", 15, 9);
        manager.addNewDefender("Peter", 17, 5);
        manager.addNewGoalie("Sam", 5, 0);
        assertEquals(3, manager.getPlayers().size());
    }

    @Test
    void testPrintNameAndAgeOfTheYoungestPlayer(){
        manager.addNewForward("Juraj", 35, 60);
        manager.addNewDefender("Peter", 20, 14);
        manager.addNewGoalie("Sam", 19, 4);
        // Redirect output
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outBytes));
        manager.printNameAndAgeOfTheYoungestPlayer();
        System.setOut(System.out);

        String output = outBytes.toString().trim();
        assertEquals("Name: Sam, Age: 19", output);

    }

    @Test
    void testPrintAllYoungestPlayers() {
        manager.addNewForward("Juraj", 25, 20);
        manager.addNewDefender("Peter", 22, 10);
        manager.addNewGoalie("Sam", 22, 5);

        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outBytes));
        manager.printAllYoungestPlayers();
        System.setOut(System.out);

        String output = outBytes.toString().trim();
        assertTrue(output.contains("Name: Peter, Age: 22"));
        assertTrue(output.contains("Name: Sam, Age: 22"));
        assertFalse(output.contains("Name: Juraj, Age: 25"));
    }

    @Test
    void testEmptyTeam(){
        ByteArrayOutputStream outBytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outBytes));
        manager.printAllYoungestPlayers();
        System.setOut(System.out);
        String output = outBytes.toString().trim();
        assertEquals("There are no players in the team", output);
    }






}
