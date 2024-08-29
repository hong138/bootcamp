package deck.backup;

public class OldSuit {
  public static final int DIAMOND = 1;
  public static final int CLUB    = 2;
  public static final int HEART   = 3;
  public static final int SPADE   = 4;

  private int value;

  public static OldSuit valueOf(int value){
    return new OldSuit(value);
  }

  public static OldSuit ofDiamond(){
    return new OldSuit(DIAMOND);
  }

  public static OldSuit ofClub(){
    return new OldSuit(CLUB);
  }

  public static OldSuit ofHeart(){
    return new OldSuit(HEART);
  }

  public static OldSuit ofSpade(){
    return new OldSuit(SPADE);
  }

  // no public constructor
  private OldSuit(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public boolean isDiamond(){
    return this.value == DIAMOND;
  }

  public boolean isClub(){
    return this.value == CLUB;
  }

  public boolean isHeart(){
    return this.value == HEART;
  }

  public boolean isSpade(){
    return this.value == SPADE;
  }

  public int compareTo(OldSuit suit){
    if (this.value == suit.getValue()){
      return 0;
    }
    return this.value > suit.getValue() ? 1 : -1;
  }

  public String toString(){
    return "(" + this.value + ")";
    }

  public static void main(String[] args) {
    // card.getSuit().getValue == 1;
    // if (card.getSuit().isDiamond())
  }
}