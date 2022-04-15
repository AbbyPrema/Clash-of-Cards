
package ca.sheridancollege.project;

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
