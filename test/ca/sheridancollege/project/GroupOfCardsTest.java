/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abarna, Gabriel, Sathya
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
 

    /**
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = new GroupOfCards(1);
        ArrayList<PorkerCard> expResult = new ArrayList<PorkerCard>();
        ArrayList<PorkerCard> result = instance.getCards();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCards method, of class GroupOfCards.
     */
    @Test
    public void testSetCards() {
        System.out.println("setCards");
        ArrayList<PorkerCard> cards = new ArrayList<PorkerCard>();
        GroupOfCards instance = new GroupOfCards(1);
        instance.setCards(cards);
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(26);
        int expResult = 26;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class GroupOfCards.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 26;
        GroupOfCards instance = new GroupOfCards(26);
        instance.setSize(size);
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        
        ArrayList<PorkerCard> cards = new ArrayList<PorkerCard>();
        cards.add(new PorkerCard());
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards(1);
        instance.setCards(cards);
        instance.shuffle();
    }

    /**
     * Test of printCards method, of class GroupOfCards.
     */
    @Test
    public void testPrintCards() {
        
        System.out.println("printCards");
        ArrayList<PorkerCard> cards = new ArrayList<PorkerCard>();
        GroupOfCards instance = new GroupOfCards(1);
        
        cards.add(new PorkerCard());
        instance.setCards(cards);
        
        instance.printCards();
    }

    /**
     * Test of popCard method, of class GroupOfCards.
     */
    @Test
    public void testPopCard() {
        System.out.println("popCard");
        
        GroupOfCards instance = new GroupOfCards(1);
        ArrayList<PorkerCard> cards = new ArrayList<PorkerCard>();
        PorkerCard pokerCard = new PorkerCard();
        
        cards.add(pokerCard);
        instance.setCards(cards);
        
        PorkerCard expResult = pokerCard;
        PorkerCard result = instance.popCard();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of pushCard method, of class GroupOfCards.
     */
    @Test
    public void testPushCard() {
        System.out.println("pushCard");
        
        GroupOfCards instance = new GroupOfCards(26);
        ArrayList<PorkerCard> cards = new ArrayList<PorkerCard>();
        
        PorkerCard pokerCard = new PorkerCard();
        cards.add(pokerCard);
        instance.setCards(cards);
        
        PorkerCard input = pokerCard;
          
        instance.pushCard(input);
    }

    /**
     * Test of pushallCard method, of class GroupOfCards.
     */
    @Test
    public void testPushallCard() {
        System.out.println("pushallCard");
        ArrayList<PorkerCard> tempcardlist = new ArrayList<>();
        tempcardlist.add(new PorkerCard());
        GroupOfCards instance = new GroupOfCards(26);
        instance.pushallCard(tempcardlist);
    }

}
