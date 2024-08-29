package deck;

import java.util.Arrays;

public class FiveCardManager extends RuleManager{
  // private final Card[] cards;

  public FiveCardManager(Card card1, Card card2, Card card3, Card card4, Card card5){
    this.cards = new Card[] {card1, card2, card3, card4, card5};
  }

  public boolean isStraight(){
  for (int i = 0; i < 4; i++) {
    if (cards[i].getRank().ordinal() != cards[i + 1].getRank().ordinal() - 1) {
        return false;
    }
  }
  return true;
  }

  public boolean isFlush(){
  Suit firstSuit = cards[0].getSuit();
  for (int i = 1; i < 5; i++) {
    if (!cards[i].getSuit().equals(firstSuit)) {
      return false;
    }
  }
  return true;
  }
    
  // public boolean isFullHouse(){
  // Arrays.sort(cards);
  // if (TriplesManager.isTriples() && PairManager.isPair()) {
  //   if (!Arrays.equals(TriplesManager.cards, PairManager.cards)) {
  //     return true;
  // }
  // }
  // return false;
  // }

  public boolean isFourKindAndOne(){
  Arrays.sort(Rank.values());
  if (cards[0].getRank().equals(cards[1].getRank()) &&
      cards[1].getRank().equals(cards[2].getRank()) &&
      cards[2].getRank().equals(cards[3].getRank()) &&
      !cards[3].getRank().equals(cards[4].getRank())) {
      return true;
  }
  if (!cards[0].getRank().equals(cards[1].getRank()) &&
      cards[1].getRank().equals(cards[2].getRank()) &&
      cards[2].getRank().equals(cards[3].getRank()) &&
      cards[3].getRank().equals(cards[4].getRank())) {
      return true;
  }
  return false;
  }

  public boolean isStraightFlush(){
    if (this.isStraight() && this.isFlush()){
      return true;
    }
    return false;
    }

    public static void main(String[] args) {
      boolean result = new FiveCardManager(new Card(Rank.THREE, Suit.DIAMOND), 
                                           new Card(Rank.FOUR, Suit.HEART),  
                                           new Card(Rank.FIVE, Suit.SPADE), 
                                           new Card(Rank.SIX, Suit.SPADE), 
                                           new Card(Rank.SEVEN, Suit.SPADE)).isStraight(); // true
      boolean result2 = new FiveCardManager(new Card(Rank.THREE, Suit.SPADE), 
                                            new Card(Rank.FOUR, Suit.SPADE),  
                                            new Card(Rank.FIVE, Suit.SPADE), 
                                            new Card(Rank.TEN, Suit.SPADE), 
                                            new Card(Rank.QUEEN, Suit.SPADE)).isFlush(); // true
      // boolean result3 = new FiveCardManager(new Card(Rank2.THREE, Suit2.DIAMOND), 
      //                                       new Card(Rank2.THREE, Suit2.HEART),  
      //                                       new Card(Rank2.THREE, Suit2.SPADE), 
      //                                       new Card(Rank2.SIX, Suit2.SPADE), 
      //                                       new Card(Rank2.SIX, Suit2.HEART)).isFullHouse(); // true
      boolean result4 = new FiveCardManager(new Card(Rank.KING, Suit.DIAMOND), 
                                            new Card(Rank.KING, Suit.HEART),  
                                            new Card(Rank.KING, Suit.SPADE), 
                                            new Card(Rank.KING, Suit.CLUB), 
                                            new Card(Rank.QUEEN, Suit.SPADE)).isFourKindAndOne(); // true
      boolean result5 = new FiveCardManager(new Card(Rank.THREE, Suit.SPADE), 
                                            new Card(Rank.FOUR, Suit.SPADE),  
                                            new Card(Rank.FIVE, Suit.SPADE), 
                                            new Card(Rank.SIX, Suit.SPADE), 
                                            new Card(Rank.SEVEN, Suit.SPADE)).isStraightFlush(); // true
      boolean result6 = new FiveCardManager(new Card(Rank.THREE, Suit.DIAMOND), 
                                            new Card(Rank.QUEEN, Suit.HEART),  
                                            new Card(Rank.FIVE, Suit.SPADE), 
                                            new Card(Rank.ACE, Suit.SPADE), 
                                            new Card(Rank.SEVEN, Suit.SPADE)).isStraight(); // false
        
        System.out.println(result);
        System.out.println(result2);
        // System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
