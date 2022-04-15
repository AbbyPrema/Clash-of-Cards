/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package warmain;
import org.junit.Before;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abarna, Gabriel, Sathya, wuhaiyan
 */
public class DeckTest {
    
    public DeckTest() {
    }
  

    /**
     * Test of getSize method, of class Deck.
     */
    @Test
    public void testGetSize() {
        System.out.println("check good getSize");
        Deck instance = new Deck(52);
        int expResult = 52;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class Deck.
     */
    @Test
    public void testSetSize() {
        System.out.println("check good setSize");
        int size = 52;
        Deck instance = new Deck(52);
        instance.setSize(size);
    }

    /**
     * Test of getCards method, of class Deck.
     */
    @Test
    public void testGetCards() {

        System.out.println("testGetCards");
        Deck instance = new Deck(52);
        String expResult = "[Heart	A, Diamond	A, Spade	A, Clubst	A, Heart	2, Diamond	2, Spade	2, Clubst	2, Heart	3, Diamond	3, Spade	3, Clubst	3, Heart	4, Diamond	4, Spade	4, Clubst	4, Heart	5, Diamond	5, Spade	5, Clubst	5, Heart	6, Diamond	6, Spade	6, Clubst	6, Heart	7, Diamond	7, Spade	7, Clubst	7, Heart	8, Diamond	8, Spade	8, Clubst	8, Heart	9, Diamond	9, Spade	9, Clubst	9, Heart	10, Diamond	10, Spade	10, Clubst	10, Heart	J, Diamond	J, Spade	J, Clubst	J, Heart	Q, Diamond	Q, Spade	Q, Clubst	Q, Heart	K, Diamond	K, Spade	K, Clubst	K]";
        String result = instance.getCards().toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("good shuffle");
        Deck instance = new Deck (52);
        instance.shuffle();
    }

    /**
     * Test of printCards method, of class Deck.
     */
    @Test
    public void testPrintCards() {
        System.out.println("printCards");
        Deck instance = new Deck (52);
        instance.printCards();
    }
    
}
