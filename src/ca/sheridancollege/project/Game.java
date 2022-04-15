
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier wuhaiyan, Abarna, Gabriel, Sathya
 */
public abstract class Game {
  private final String name;//the title of the game
    private ArrayList<User> players;// the players of the game
    

    public Game(String name) {
        this.name = name;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<User> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<User> players) {
        this.players = players;
    }
    
    User player1= new User();
    User computer1= new User();
    
    public void play(){        
        this.initialPlaying();
        Scanner playerInput = new Scanner(System.in);
        System.out.println("----------------War game start! Are you ready? (Y/N)----------");
        String answer=playerInput.nextLine();
        ArrayList<PorkerCard> tempMorecards=new ArrayList<PorkerCard>();
        while (answer.equals("Y")||answer.equals("y")&&(player1.getCards().getSize()>0)&&(computer1.getCards().getSize()>0)){
            this.playRound(tempMorecards);
            System.out.println("----------------Continue? (Y/N)----------");
            answer=playerInput.nextLine();
            
        }
        
//        System.out.println("computer cards");
//        player1.getCards().printCards();
//        System.out.println(player1.getName());
//        computer1.getCards().printCards();
        
        this.declearWinner();
        
    }
    
    public void initialPlaying(){
        //set the username to player object
        Scanner inPut = new Scanner(System.in);
        System.out.println("Enter username");
        String userName=inPut.nextLine();
        player1.setName(userName);
        computer1.setName("computer");
        
        //the the username to game.plyers
        
        //this.players.add(player1);
        //this.players.add(computer1);
        
        Deck oneDeck=new Deck(52);
        oneDeck.shuffle();
        //oneDeck.printCards();
        GroupOfCards computerCard=new GroupOfCards(26);
        GroupOfCards playerCard=new GroupOfCards(26);
        
        ArrayList<PorkerCard> temp=new ArrayList(oneDeck.getCards().subList(0,26));
        computerCard.setCards(temp);
        computer1.setCards(computerCard);
        temp=new ArrayList(oneDeck.getCards().subList(26,52));
        playerCard.setCards(temp);
        player1.setCards(playerCard);
                
    }
    
    public void playRound(ArrayList<PorkerCard> tempMorecards){
        PorkerCard tempPlayercard=new PorkerCard();
        PorkerCard tempComputercard=new PorkerCard();
        tempPlayercard=player1.getCards().popCard();
        tempComputercard=computer1.getCards().popCard();
        
        tempMorecards.add(tempPlayercard);
        tempMorecards.add(tempComputercard);
        
        System.out.println(player1.getName()+"  "+player1.getCards().getSize()+" cards in hand!\t"+tempPlayercard.toString());
        System.out.println(computer1.getName()+"  "+computer1.getCards().getSize()+" cards in hand!\t"+tempComputercard.toString());
        if (tempPlayercard.cardValue>tempComputercard.cardValue){
            System.out.println(player1.getName()+" wins this round! Gets "+tempMorecards.size()+" more cards!");
            player1.getCards().pushallCard(tempMorecards);
            tempMorecards.clear();
//            player1.getCards().pushCard(tempPlayercard);
//            player1.getCards().pushCard(tempComputercard);
        }else if (tempPlayercard.cardValue<tempComputercard.cardValue){
            System.out.println(computer1.getName()+" wins this round! Gets "+tempMorecards.size()+" more cards!");
            computer1.getCards().pushallCard(tempMorecards);
            tempMorecards.clear();
//            computer1.getCards().pushCard(tempPlayercard);
//            computer1.getCards().pushCard(tempComputercard);
        }else{
            System.out.println("3 more cards!");
            tempPlayercard=player1.getCards().popCard();
            tempComputercard=computer1.getCards().popCard();
        
            tempMorecards.add(tempPlayercard);
            tempMorecards.add(tempComputercard);
            
            tempPlayercard=player1.getCards().popCard();
            tempComputercard=computer1.getCards().popCard();
        
            tempMorecards.add(tempPlayercard);
            tempMorecards.add(tempComputercard);
            System.out.println(tempMorecards.size()+" cards in winning deck!");
            this.playRound(tempMorecards);
        }
    }

    public void declearWinner(){
        if(player1.getCards().getSize()>computer1.getCards().getSize()){
            System.out.println("Congratulation! "+player1.getName()+" Win! With "+player1.getCards().getSize()+ " cards in hand!");
        }else if(player1.getCards().getSize()<computer1.getCards().getSize()){
            System.out.println("Congratulation! "+computer1.getName()+" Win! With "+computer1.getCards().getSize()+ " cards in hand!");
        }else{
            System.out.println("DRAW!");
        }
        
    }

}
