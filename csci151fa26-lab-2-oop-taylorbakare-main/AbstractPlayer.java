
import java.util.Random;

public abstract class AbstractPlayer implements Player {

    protected Card[] hand;

    protected int bookScore;

    protected int playerNumber;

    public abstract int decideRank();

    public AbstractPlayer(){
        Random random = new Random();
        this.playerNumber = random.nextInt(2) + 1; 
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
        for (int i = 0; i < cards.length; i++){
            newCards[i] = cards[i];
        }
        for (int j = 0; j < this.hand.length; j++){
            newCards[cards.length + j] = this.hand[j];
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
    for (int i = 0; i < this.hand.length; i++){
        int thisRank = this.hand[i].getRank();
        if (countCards(thisRank) == 4){
            bookScore++;
            removeCards(thisRank);
            i = -1;
        }
    }
}


    public int getNumCards(){
        return this.hand.length;
    }

    public int getBookScore(){
        return this.bookScore;
    }

   

}