/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warmain;
import java.util.ArrayList;
import java.util.Random;
/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier wuhaiyan, Abarna, Gabriel, Sathya
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<PorkerCard> cards=new ArrayList<PorkerCard>();
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<PorkerCard> getCards() {
        return this.cards;
    }
    
    public void setCards(ArrayList<PorkerCard> cards){
        this.cards=cards;
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return this.size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public void shuffle() {
        
    Random rand = new Random();
    PorkerCard temp = new PorkerCard();
        for (int i = 0; i < this.size; i++) {
            int randomIndexToSwap = rand.nextInt(this.size);
            temp = this.cards.get(randomIndexToSwap);
            this.cards.set(randomIndexToSwap, this.cards.get(i));
            this.cards.set(i, temp);
        }
    }
    public void printCards(){
        for(int i=0;i<this.size;i++ ){
            System.out.println(this.cards.get(i).cardName+"\t"+this.cards.get(i).cardSuite);
        }
    }
    
    public PorkerCard popCard(){
        PorkerCard tempcard=new PorkerCard();
        this.size-=1;
        tempcard=this.cards.get(0);
        this.cards.remove(0);
        return tempcard;       
    }
    public void pushCard(PorkerCard tempcard){
        this.cards.add(tempcard);
        this.size+=1;
    }
    
    public void pushallCard(ArrayList<PorkerCard> tempcardlist){
        this.cards.addAll(tempcardlist);
        this.size+=tempcardlist.size();
    }

}