package deck;

public enum Rank2 {
  ACE(12, 'A', "Ace"),
  TWO(13, '2', "Two"), 
  THREE(1, '3', "Three"), 
  FOUR(2, '4', "Four"), 
  FIVE(3, '5', "Five"), 
  SIX(4, '6', "Six"), 
  SEVEN(5, '7', "Seven"), 
  EIGHT(6, '8', "Eight"), 
  NINE(7, '9', "Nine"), 
  TEN(8, 'T', "Ten"), 
  JACK(9, 'J', "Jack"), 
  QUEEN(10, 'Q', "Queen"), 
  KING(11, 'K', "King");

  private final int value;
  private final char c;
  private final String s;

  private Rank2 (int value, char c, String s){
    this.value = value;
    this.c = c;
    this.s = s;
  }

  public int getValue(){
    return this.value;
  }

  public char getChar(){
    return this.c;
  }

  public String getString(){
    return this.s;
  }

  public static int length(){
    // values()
    return Rank2.values().length;
  }

  public int compare(Rank2 rank){
    if (this == rank){
      return 0;
    }
    return this.value > rank.getValue() ? 1 : -1;
  }
  
  public static void main(String[] args) {
    // testing
    System.out.println(Rank2.FOUR.getValue());
  }
}
