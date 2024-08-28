package deck;

public class RuleManager {
  public final Card[] cards;

    public RuleManager(Card[] cards) {
        this.cards = cards;
    }

  public boolean isPair(Card card1, Card card2){
    return new PairManager(card1, card2).isPair();
  }

  public boolean isTriples(Card card1, Card card2, Card card3){
    return new TriplesManager(card1, card2, card3).isTriples();
  }

  public boolean isFourKind(Card card1, Card card2, Card card3, Card card4){
    return new FourKindManager(card1, card2, card3, card4).isFourKind();
  }

  public boolean isStraight(Card card1, Card card2, Card card3, Card card4, Card card5){
    return new FiveCardManager(card1, card2, card3, card4, card5).isStraight();
  }

  public boolean isFlush(Card card1, Card card2, Card card3, Card card4, Card card5){
    return new FiveCardManager(card1, card2, card3, card4, card5).isFlush();
  }

  // public boolean isFullHouse(Card card1, Card card2, Card card3, Card card4, Card card5){
  //   return new FiveCardManager(card1, card2, card3, card4, card5).isFullHouse();
  // }

  public boolean isFourKindAndOne(Card card1, Card card2, Card card3, Card card4, Card card5){
    return new FiveCardManager(card1, card2, card3, card4, card5).isFourKindAndOne();
  }

  public boolean isStraightFlush(Card card1, Card card2, Card card3, Card card4, Card card5){
    return new FiveCardManager(card1, card2, card3, card4, card5).isStraightFlush();
  }

  // abstract int compareTo();
}
