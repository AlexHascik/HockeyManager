package org.hockeymanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoalieTest {
    @Test
    void testCorrectGoalieCreation() {
        Goalie goalie = new Goalie("Juraj", 28, 5);
        assertEquals("Juraj", goalie.getName());
        assertEquals(28, goalie.getAge());
        assertEquals(Position.GOALIE, goalie.getPosition());
        assertEquals(5, goalie.getWins());
    }

    @Test
    void testInvalidWins() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Goalie("Juraj", 28, -2));
        assertEquals("Wins cannot be negative", exception.getMessage());
    }

    @Test
    void testSetWins() {
        Goalie goalie = new Goalie("Juraj", 28, 5);
        goalie.setWins(10);
        assertEquals(10, goalie.getWins());
    }

    @Test
    void testInvalidSetWins() {
        Goalie goalie = new Goalie("Juraj", 28, 5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> goalie.setWins(-1));
        assertEquals("Wins cannot be negative", exception.getMessage());
        // Verify wins is unchanged
        assertEquals(5, goalie.getWins());
    }
}