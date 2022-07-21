package hu.fazekas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sheepCountTest() {
        String[] animals = new String[] {"sheep", "duck", "dog", "sheep"};
        int something = Main.sheepCount(animals);
        assertEquals(2, something);
    }
    @Test
    void sheepCountTestBeta() {
        int something = Main.sheepCount(null);
        assertEquals(0, something);
    }
    @Test
    void sheepCountTestCharlie() {
        String[] animals = new String[] {"sheep", null, "dog", "sheep"};
        int something = Main.sheepCount(animals);
        assertEquals(2, something);
    }
    @Test
    void sheepCountTestDelta() {
        String[] animals = new String[]{"sheep", "duck", "dog", new String ("sheep")};
        int something = Main.sheepCount(animals);
        assertEquals(2, something);
    }
    @Test
    void getAliveSheepCount(){

        String[] animals = new String[] {"sheep", "duck", "wolf", "sheep"};
        SheepCounter obj =new SheepCounter();
        int total2=obj.getAliveSheepCount(animals);
        assertEquals(1,total2);
    }
    @Test
    void getAliveSheepCount1(){

        String[] animals = new String[] {"sheep", "duck", "SwOlf", "sheep"};
        SheepCounter obj =new SheepCounter();
        int total2=obj.getAliveSheepCount(animals);
        assertEquals(1,total2);
    }
    @Test
    void getAliveSheepCount2(){

        String[] animals = new String[] {"sheep", "duck", "Wf", "sheep"};
        SheepCounter obj =new SheepCounter();
        int total2=obj.getAliveSheepCount(animals);
        assertEquals(1,total2);
    }
    @Test
    void getAliveSheepCount3(){

        String[] animals = new String[] {"sheep", "duck", "woLF", "sheep"};
        SheepCounter obj =new SheepCounter();
        int total2=obj.getAliveSheepCount(animals);
        assertEquals(1,total2);
    }
}