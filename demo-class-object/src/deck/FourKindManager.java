package deck;

public class FourKindManager {

    private final Card[] cards;

    public FourKindManager(Card card1, Card card2, Card card3, Card card4) {
        this.cards = new Card[]{card1, card2, card3, card4};
    }

    public boolean isFourKind() {
        return cards[0].equals(cards[1]) && cards[1].equals(cards[2]) && cards[2].equals(cards[3]);
    }

    public static void main(String[] args) {
        boolean result = new FourKindManager(new Card(Rank.ACE, Suit.DIAMOND), 
                                             new Card(Rank.THREE, Suit.HEART),  
                                             new Card(Rank.TWO, Suit.SPADE), 
                                             new Card(Rank.FOUR, Suit.SPADE)).isFourKind(); // false
        boolean result2 = new FourKindManager(new Card(Rank.TWO, Suit.DIAMOND), 
                                              new Card(Rank.TWO, Suit.HEART),   
                                              new Card(Rank.TWO, Suit.SPADE), 
                                              new Card(Rank.TWO, Suit.CLUB)).isFourKind(); // true
        boolean result3 = new FourKindManager(new Card(Rank.NINE, Suit.DIAMOND), 
                                              new Card(Rank.THREE, Suit.DIAMOND), 
                                              new Card(Rank.TWO, Suit.DIAMOND), 
                                              new Card(Rank.TEN, Suit.DIAMOND)).isFourKind(); // false

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
