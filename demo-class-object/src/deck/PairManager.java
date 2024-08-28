package deck;

public class PairManager{
  private final Card[] cards;
  public static boolean isPair;
  // !!! final -> Card array object reference, but you can still change the card object
  // !!! unless you provide setter to revise the card object

  public PairManager(Card card1, Card card2){
    this.cards = new Card[] {card1, card2};
  }

  public boolean isPair(){
    return cards[0].getRank().equals(cards[1].getRank());
    }

    // !!! if there is no setter for card object

  public static void main(String[] args) {
    
    boolean result = new PairManager(new Card(Rank2.ACE, Suit2.DIAMOND), new Card(Rank2.THREE, Suit2.HEART)).isPair(); // false
    boolean result2 = new PairManager(new Card(Rank2.TWO, Suit2.DIAMOND), new Card(Rank2.TWO, Suit2.HEART)).isPair(); // true
    boolean result3 = new PairManager(new Card(Rank2.NINE, Suit2.DIAMOND), new Card(Rank2.THREE, Suit2.DIAMOND)).isPair(); // false
    boolean result4 = new PairManager(new Card(Rank2.FIVE, Suit2.DIAMOND), new Card(Rank2.FIVE, Suit2.DIAMOND)).isPair(); // true

    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
  }
}
