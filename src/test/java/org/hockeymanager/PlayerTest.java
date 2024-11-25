package org.hockeymanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void testInvalidPlayerName(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Forward("", 18, 10));
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    void testInvalidPlayerAge(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Forward("Peter", 0, 100));
        assertEquals("Age must be between " + Player.MIN_PLAYER_AGE + " and " + Player.MAX_PLAYER_AGE, exception.getMessage());
    }
}
