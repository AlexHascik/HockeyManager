package org.hockeymanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ForwardTest {

    @Test
    void testCorrectForwardCreation(){
        Forward forward = new Forward("Peter", 20, 10);
        assertEquals("Peter", forward.getName());
        assertEquals(20, forward.getAge());
        assertEquals(Position.FORWARD, forward.getPosition());
        assertEquals(10, forward.getGoals());
    }

    @Test
    void testInvalidGoals(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Forward("Peter", 20, -1));
        assertEquals("Goals cannot be negative", exception.getMessage());
    }

    @Test
    void testSetGoals(){
        Forward forward = new Forward("Peter", 20, 10);
        forward.setGoals(11);
        assertEquals(11, forward.getGoals());
    }

    @Test
    void testInvalidSetGoals(){
        Forward forward = new Forward("Peter", 20, 10);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> forward.setGoals(-2));
        assertEquals("Goals cannot be negative", exception.getMessage());
        // Verify the goals value is unchanged
        assertEquals(10, forward.getGoals());
    }
}
