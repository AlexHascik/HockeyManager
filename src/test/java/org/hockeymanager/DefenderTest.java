package org.hockeymanager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefenderTest {
    @Test
    void testValidDefenderCreation() {
        Defender defender = new Defender("Sam", 30, 15);
        assertEquals("Sam", defender.getName());
        assertEquals(30, defender.getAge());
        assertEquals(Position.DEFENDER, defender.getPosition());
        assertEquals(15, defender.getHits());
    }

    @Test
    void testInvalidHits() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Defender("Sam", 30, -5));
        assertEquals("Hits cannot be negative", exception.getMessage());
    }

    @Test
    void testSetHits() {
        Defender defender = new Defender("Sam", 30, 10);
        defender.setHits(15);
        assertEquals(15, defender.getHits());
    }

    @Test
    void testInvalidSetHits() {
        Defender defender = new Defender("Sam", 30, 10);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> defender.setHits(-1));
        assertEquals(10, defender.getHits());
    }
}
