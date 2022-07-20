package hu.fazekas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SheepCounterTest {

    @Test
    void getAllSheepCount() {
        SheepCounter obj = new SheepCounter();
        int total = obj.getAllSheepCount();
        assertEquals(0,total);
        String[] animals = new String[] {"sheep", "duck", "dog", "sheep"};
        obj.sheepCount(animals);
        total = obj.getAllSheepCount();
        assertEquals(2,total);
        obj.sheepCount(animals);
        total = obj.getAllSheepCount();
        assertEquals(4,total);
    }
}