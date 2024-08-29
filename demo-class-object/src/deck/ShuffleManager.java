package deck;

import java.util.Random;

public class ShuffleManager {
  
  private Card[] cards;

  public ShuffleManager(SDeck sdeck) {
    // check if all 52 objects exist, otherwise you may throw exception
    this.cards = sdeck.getCards();
  }

  public Card[] getCards() {
    return this.cards;
  }

  // Deck Object behavior
  public void shuffle() {
    // Separate the cards into 3 parts (each part contains at least 1 card)
    // idx: part1 length
    int idx = new Random().nextInt(52 - 1); // 0 - 50
    int number = new Random().nextInt(52 - 1 - idx) + 1; // 1 - 51
    // Bottom: begin=0, end=idx
    // Middle: begin=idx + 1, end=idx + number
    // Top: beign=idx+number+1, end=51

    // Backup 3 parts of cards
    Card[] bottom = new Card[idx]; // length: 1 - 50
    Card[] middle = new Card[number]; 
    Card[] top = new Card[52 - idx - number];
    
    // Bottom Part
    int c = 0;
    for (int i = 0; i < idx; i++) {
      bottom[c++] = this.cards[i];
    }

    // Middle Part
    c = 0;
    for (int i = idx; i < idx + number; i++) {
      middle[c++] = this.cards[i];
    }

    // Top Part
    c = 0;
    for (int i = idx + number; i < 52; i++) {
      top[c++] = this.cards[i];
    }
    
    // Overwrite 3 parts of cards to the original Card array
    c = 0;
    for (int i = 0; i < bottom.length; i++) {
      this.cards[c++] = bottom[i];
    }
    for (int i = 0; i < top.length; i++) {
      this.cards[c++] = top[i];
    }
    for (int i = 0; i < middle.length; i++) {
      this.cards[c++] = middle[i];
    }
  }
}
