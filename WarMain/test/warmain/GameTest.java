/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package warmain;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abarna, Gabriel, Sathya, wuhaiyan
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Game instance = new Game("Sathya");
        String expResult = "Sathya";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = new Game("");
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.getPlayers();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<User> players = null;
        Game instance = new Game("");
        instance.setPlayers(players);
    }

    
    
    @Test
    public void testDeclearWinner() {
        System.out.println("declearWinner");
        Game instance = new Game("sathya");
        instance.declearWinner();
    }
    
}
