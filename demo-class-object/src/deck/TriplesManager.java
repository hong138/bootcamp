package deck;

public class TriplesManager {
  private final Card[] cards;

  public TriplesManager(Card card1, Card card2, Card card3){
    this.cards = new Card[] {card1, card2, card3};
  }

  public boolean isTriples(){
    return cards[0].equals(cards[1]) && cards[1].equals(cards[2]);
    }

  public static void main(String[] args) {
    boolean result = new TriplesManager(new Card(Rank2.ACE, Suit2.DIAMOND), new Card(Rank2.THREE, Suit2.HEART), new Card(Rank2.TWO, Suit2.SPADE)).isTriples(); // false
    boolean result2 = new TriplesManager(new Card(Rank2.TWO, Suit2.DIAMOND), new Card(Rank2.TWO, Suit2.HEART), new Card(Rank2.TWO, Suit2.SPADE)).isTriples(); // true
    boolean result3 = new TriplesManager(new Card(Rank2.NINE, Suit2.DIAMOND), new Card(Rank2.THREE, Suit2.DIAMOND), new Card(Rank2.TWO, Suit2.SPADE)).isTriples(); // false
    boolean result4 = new TriplesManager(new Card(Rank2.FIVE, Suit2.DIAMOND), new Card(Rank2.FIVE, Suit2.DIAMOND), new Card(Rank2.FIVE, Suit2.SPADE)).isTriples(); // true

    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    }
}
