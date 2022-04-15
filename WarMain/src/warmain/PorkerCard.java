/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warmain;

/**
 *
 * @author wuhaiyan, Abarna, Gabriel, Sathya
 */
public class PorkerCard extends Card{

    public int cardValue;
        
    @Override
    public String toString(){
       return this.cardName+"\t"+this.cardSuite; 
    }

    

}