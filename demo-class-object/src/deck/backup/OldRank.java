package deck.backup;

public class OldRank {
  // static final, static, final, instance variable
  // Constant (static final) -> should be public
  public static final char ACE = 'A';
  public static final char TWO = '2';
  public static final char THREE = '3';
  public static final char FOUR = '4';
  public static final char FIVE = '5';
  public static final char SIX = '6';
  public static final char SEVEN = '7';
  public static final char EIGHT = '8';
  public static final char NINE = '9';
  public static final char TEN = 'T';
  public static final char JACK = 'J';
  public static final char QUEEN = 'Q';
  public static final char KING = 'K';

  // final instance variable
  private final String name = "ABC"; // every Rank Object has name attribute

  private char value;

  public OldRank(char value) {
    this.value = value;
  }

  public char getValue() {
    return this.value;
  }

  public boolean equals(OldRank rank){
    if (this == rank){
      return true;
    }
    return false;
  }

  public String toString(){
    return "(" + this.value + ")";
    }

  public int compareTo(OldRank rank) {
    // Early return
    if (this.value != rank.getValue()) {
      if (this.value == TWO)
        return 1;
      if (rank.getValue() == TWO)
        return -1;
      if (this.value == ACE)
        return 1;
      if (rank.getValue() == ACE)
        return -1;
      if (this.value == KING)
        return 1;
      if (rank.getValue() == KING)
        return -1;
      if (this.value == QUEEN)
        return 1;
      if (rank.getValue() == QUEEN)
        return -1;
      if (this.value == JACK)
        return 1;
      if (rank.getValue() == JACK)
        return -1;
      if (this.value == TEN)
        return 1;
      if (rank.getValue() == TEN)
        return -1;
      return this.value > rank.getValue() ? 1 : -1; // 3 - 9
    }
    return 0;
  }
}
