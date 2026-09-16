
import java.util.Random;

public abstract class AbstractPlayer implements Player {

    protected Card[] hand;

    protected int bookScore;

    protected int playerNumber;

    public abstract int decideRank();

    public AbstractPlayer(int playerNumber){
        // Random random = new Random();
        // this.playerNumber = random.nextInt(2) + 1; 
        this.playerNumber = playerNumber;
        this.hand = new Card[0];
        this.bookScore = 0; 
    }

     private Card[] removeCards(int rank){
        int remLength = 0;
        for(int i = 0; i < this.hand.length; i++){
            if(this.hand[i].getRank() == rank){
                remLength++;
            }
        }
        Card[] newHand = new Card[this.hand.length - remLength];
        int position = 0;
        for(int j = 0; j < this.hand.length; j++){
            if(this.hand[j].getRank() != rank){
                newHand[position] = this.hand[j];
                position++;
            }
        }
        this.hand = newHand;
        return this.hand;
     }

    protected int countCards(int rank){
        int matchCount = 0;
         for(int i = 0; i < this.hand.length; i++){
            if(this.hand[i].getRank() == rank){
                matchCount++;
            }
        }
        return matchCount;
     }

    public void gainCards(Card[] cards){
        Card[] newCards = new Card[cards.length + this.hand.length];
        for (int i = 0; i < this.hand.length; i++){
            newCards[i] = this.hand[i];
        }
        for (int j = 0; j < cards.length; j++){
            newCards[this.hand.length + j] = cards[j];
        }
        this.hand = newCards;
    }

    public Card[] requestCards(int rank){
        Card[] matchedCards = new Card[countCards(rank)];
        int position = 0;
        for (int i = 0; i< this.hand.length; i++){
            if(this.hand[i].getRank() == rank){
                matchedCards[position] = this.hand[i];
                position++;
            }
        }
        removeCards(rank);
        return matchedCards;
    }

    public void checkBooks(){
    int count = 0;
    for (int i = 0; i < this.hand.length; i++){
        for (int j = 0; j < this.hand.length; j++){
            if (this.hand[j].getRank() == this.hand[i].getRank()){
                count++;
                System.out.println("Matched!");
                System.out.println("Count is: " + count);
            }
        }
        System.out.println("Iteration " + i + "ends.");
        if (count == 4){
            bookScore++;
            removeCards(this.hand[i].getRank());
            i = -1;
        }
        count = 0;
        }
    }



    public int getNumCards(){
        return this.hand.length;
    }

    public int getBookScore(){
        return this.bookScore;
    }

   

}