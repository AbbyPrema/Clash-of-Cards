/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warmain;

import java.util.ArrayList;

/**
 *
 * @author wuhaiyan, Abarna, Gabriel, Sathya
 */
public class User extends Player {
   
    //private ArrayList<PorkerCard> handCards1 = new ArrayList<PorkerCard> ();
    private GroupOfCards handCards = new GroupOfCards(26);
    
    public User(String name) {
        this.name=name;
    }
    public User(){
        
    }
    

    public String getName() {
        return this.name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */

    public void setName(String name) {
        this.name=name;
    }
    public GroupOfCards getCards() {
        return this.handCards;
    }
   
    public void setCards(GroupOfCards cards){
        this.handCards=cards;
    }
    
}
