package deck;

public class RuleManager {
  
  public boolean isPair(Card card1, Card card2){
    return new PairManager(card1, card2).isPair();
  }

  public boolean isTriples(Card card1, Card card2, Card card3){
    return new TriplesManager(card1, card2, card3).isTriples();
  }

  public boolean isFourKind(Card card1, Card card2, Card card3, Card card4){
    return new FourKindManager(card1, card2, card3, card4).isFourKind();
  }

  public boolean isFiveCard(Card card1, Card card2, Card card3, Card card4, Card card5){
    // counting
    return false;
  }
}
