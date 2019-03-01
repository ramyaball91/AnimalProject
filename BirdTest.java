package test;

import static org.junit.Assert.*;
import Assignment.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class BirdTest {
	
	 @Rule
	 public SystemOutResource sysOut = new SystemOutResource();

    Bird bird;

    @Before
    public void setUp() {
        this.bird = new Bird();
    }

    @Test
    public void testWalk() {
        bird.walk();
        assertEquals("I am walking",sysOut.asString());
    }


    @Test
    public void testFly() {
        bird.fly();
        assertEquals("I am flying",sysOut.asString());
    }

    @Test
    public void testSing() {
        bird.sing();
        assertEquals("I am singing",sysOut.asString());
    }
    
}