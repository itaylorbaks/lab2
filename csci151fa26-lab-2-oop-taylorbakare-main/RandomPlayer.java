import java.util.Random;

public class RandomPlayer extends AbstractPlayer{

   
    public RandomPlayer(int playerNumber){
        super(playerNumber);
    }

    public int decideRank(){
        Random random = new Random();
        int position = random.nextInt(hand.length);
        return this.hand[position].getRank();
    }

    public static void main(String args[]){
        RandomPlayer randPlayer = new RandomPlayer(1);
        Card[] cards = new Card[] {
	        new Card(Card.Suit.Heart, 2),
	        new Card(Card.Suit.Diamond, 2),
	        new Card(Card.Suit.Spade, 5),
	        new Card(Card.Suit.Club, 7),
	        new Card(Card.Suit.Heart, 8)
        };
        randPlayer.gainCards(cards);
        for(int i = 0; i < randPlayer.hand.length; i++){
            System.out.println("Added Card of Suit: " + randPlayer.hand[i].getSuit() + " Rank: " +randPlayer.hand[i].getRank());
        }

        Card[] requested = randPlayer.requestCards(2);
        for (int i = 0; i < requested.length; i++){
            System.out.println("You Requested Cards of Rank 2");
            System.out.println("Matched Card of Suit: " + requested[i].getSuit() + " Rank: " +requested[i].getRank());
        }

        Card[] emptyRequested = randPlayer.requestCards(3);
        System.out.println("You Requested Cards of Rank 3");
        System.out.println(emptyRequested.length);

        Card[] someNewCards = new Card[] {
	        new Card(Card.Suit.Spade, 2),
	        new Card(Card.Suit.Club, 2),
            new Card(Card.Suit.Heart, 2),
	        new Card(Card.Suit.Diamond, 2),
        };

        randPlayer.gainCards(someNewCards);
        System.out.println("New Cards: ");
        for(int i = 0; i < randPlayer.hand.length; i++){
            System.out.println("Added Card of Suit: " + randPlayer.hand[i].getSuit() + " Rank: " +randPlayer.hand[i].getRank());
        }

        randPlayer.checkBooks();
        System.out.println("Book Score: " +randPlayer.bookScore);
        System.out.println("New Hand: ");
        for(int i = 0; i < randPlayer.hand.length; i++){
            System.out.println("Suit: " + randPlayer.hand[i].getSuit() + " Rank: " +randPlayer.hand[i].getRank());
        }



    }

    
}