/**
 * The Card class defines a card object for the {@link GoFish} game.
 * 
 * @author Your Name Goes Here
 */
public class Card {
    /** The possible suits of a card. */
    public enum Suit {Club, Diamond, Heart, Spade};

    private Suit suit;
    private int rank;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public int getRank(){
        return this.rank;
    }

    public boolean equals(Object another) {
        Card otherCard = (Card) another; 
        return this.suit == otherCard.suit && this.rank == otherCard.rank;
    }

    public String toString() {
        String string = ("Suit: " + this.suit + " Rank: " + this.rank);
        return string;
    }

    /* Your getSuit, getRank, equals, and toString methods go here. */
}
