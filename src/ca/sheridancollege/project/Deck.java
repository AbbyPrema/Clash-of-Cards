package ca.sheridancollege.project;

/**
 *
 * @author wuhaiyan, Abarna, Gabriel, Sathya
 */
import java.util.Random;
import java.util.ArrayList;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */

public class Deck {
private int size=52;
	/**
	 * The group of cards, stored in an ArrayList
	 */
	private ArrayList<PorkerCard> cards = new ArrayList<PorkerCard> ();

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<PorkerCard> getCards() {

            return this.cards;
	}

	/**
	 * the size of the grouping
	 * @param size
	 */
	public Deck(int size) {
        String[] suiteT={"Heart","Diamond","Spade", "Clubst"};
        String[] numT={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (int i=0;i<13;i++ ){
            for (int j=0;j<4;j++){
                PorkerCard newCard=new PorkerCard();
                newCard.cardSuite= numT[i];
                newCard.cardName= suiteT[j];
		newCard.cardValue=i+1;   
		this.cards.add(newCard);
               
            }
        }
        
    }

	public void shuffle() {
            Random rand = new Random();
            PorkerCard temp = new PorkerCard();
            for (int i = 0; i < this.size; i++) {
                int randomIndexToSwap = rand.nextInt(this.size);
                temp = this.cards.get(randomIndexToSwap);
                this.cards.set(randomIndexToSwap,this.cards.get(i)) ;
                this.cards.set(i, temp);
		}

		//throw new UnsupportedOperationException();
	}
        public void printCards(){
            for(int i=0;i<this.size;i++ ){
            System.out.println(this.cards.get(i).cardName+"\t"+this.cards.get(i).cardSuite);
        }
    }
           
	

}