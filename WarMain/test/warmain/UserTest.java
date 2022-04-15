/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package warmain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abarna, Gabriel, Sathya, wuhaiyan
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User("Guido");
        String expResult = "Guido";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Test";
        User instance = new User("Test");
        instance.setName(name);
    }

    /**
     * Test of getCards method, of class User.
     */
    @Test
    public void testGetCards() {
        
        System.out.println("getCards");
        User instance = new User();
        GroupOfCards cards = new GroupOfCards(26);
        instance.setCards(cards);
        GroupOfCards expResult = cards;
        GroupOfCards result = instance.getCards();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCards method, of class User.
     */
    @Test
    public void testSetCards() {
        System.out.println("setCards");
        GroupOfCards cards = new GroupOfCards(26);
        User instance = new User();
        instance.setCards(cards);
    }
    
}
