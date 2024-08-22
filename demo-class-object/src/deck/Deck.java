package deck;

import java.util.Arrays;

public class Deck {

    private static final Suit[] suits = new Suit[]{Suit.ofDiamond(), Suit.ofClub(), Suit.ofHeart(), Suit.ofSpade()};
    private static final Rank[] ranks = new Rank[]{Rank.ofACE(), Rank.ofTWO(), Rank.ofTHREE(), Rank.ofFOUR(), 
                                                   Rank.ofFIVE(), Rank.ofSIX(), Rank.ofSEVEN(), Rank.ofEIGHT(), 
                                                   Rank.ofNINE(),  Rank.ofTEN(),  Rank.ofJACK(),  Rank.ofQUEEN(),  Rank.ofKING()};

    private Card[] cards;

    public Deck() {
        this.cards = new Card[suits.length * ranks.length]; // !!! initialize emtry array
        // create 52 cards, and then put it into Deck Object
        int idx = 0;
        for (Suit suit : suits) {
          for (Rank rank : ranks) {
            this.cards[idx++] = new Card(rank, suit);
            }
        }
    }

    public int size() {
        return this.cards.length;
    }

    public String toString(){
      return "Deck(" + "card=" + Arrays.toString(this.cards) + ")";
    }

    public void shuffle(){
      for (int i = cards.length -1; i > 0; i--) {
        int randomIndex = (i * suits.length + ranks.length) % cards.length;
        Card temp = cards[i];
        cards[i] = cards[randomIndex];
        cards[randomIndex] = temp;
      }
    }

    public static void main(String[] args) {
      Deck deck = new Deck();
      System.out.println(deck.size());

      // Without toString(), sysout custom object -> object reference (i.e. deck.Deck@2f92e0f4)
      System.out.println(deck); // System.out.println(deck.toString())
      System.out.println("---------------------------------------");
      System.out.println("---------------------------------------");
      System.out.println("---------------------------------------");
      deck.shuffle();
      System.out.println(deck);
      System.out.println("---------------------------------------");
      System.out.println("---------------------------------------");
      System.out.println("---------------------------------------");
      deck.shuffle();
      System.out.println(deck);
      System.out.println("---------------------------------------");
      System.out.println("---------------------------------------");
      System.out.println("---------------------------------------");
      deck.shuffle();
      System.out.println(deck);
    }
}
