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
public class PorkerCardTest {
    
    public PorkerCardTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of toString method, of class PorkerCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PorkerCard instance = new PorkerCard();
        String expResult = instance.cardName+"\t"+instance.cardSuite;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
