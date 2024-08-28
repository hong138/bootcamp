package deck;

public enum Suit2 {
  // create enum object
  // DIAMOND, // call emtry constructor
  DIAMOND(1), //
  CLUB(2), //
  HEART(3), //
  SPADE(4), //
  ;

  private final int value;

  private Suit2 (int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  // 
  public int compare(Suit2 suit){
    // this vs suit
    if (this == suit){
      return 0;
    }
    return this.value > suit.getValue() ? 1 : -1;
  }

  public static int length(){
    // values()
    return Suit2.values().length;
  }

  // values() method is implicitly created by JAVA when the class is enum
  public static Suit2 get(int value){
    for (Suit2 suit : Suit2.values()){
      if (suit.getValue() == value){
        return suit;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    // Load classes to Memory
    // enum -> create objects for enum
    // static/ static final
    // start to read your code in main method

    System.out.println(Suit2.CLUB.compare(Suit2.DIAMOND)); // 1

    // enum.class compareTo() by default checking address
    System.out.println(Suit2.CLUB.compareTo(Suit2.DIAMOND)); // 1
    System.out.println(Suit2.CLUB.compareTo(Suit2.CLUB)); // 0
    System.out.println(Suit2.CLUB.compareTo(Suit2.HEART)); // -1
    System.out.println(Suit2.CLUB.compareTo(Suit2.SPADE));  // -2

    // equals() -> result OK
    Suit2 unknown = Suit2.HEART;
    System.out.println(unknown.equals(Suit2.HEART)); // true
    System.out.println(unknown == Suit2.HEART); // true
    System.out.println(unknown != Suit2.HEART); // false

    System.out.println(Suit2.HEART.getValue()); // 3

    // name()
    System.out.println(Suit2.DIAMOND.name()); // "DIAMOND"
    System.out.println(Suit2.DIAMOND.toString()); // "DIAMOND"

    // ordinal() -> index ordering (start from 0)
    System.out.println(Suit2.HEART.ordinal()); // 2 (index)
  }
}
