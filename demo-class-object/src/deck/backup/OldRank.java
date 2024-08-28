package deck;

public class Rank {
  // static final, static, final, instance variable
  // Constant (static final) -> should be public


  // final instance variable
  private final String name = "ABC"; // every Rank Object has name attribute

  private char value;

  public Rank(char value) {
    this.value = value;
  }

  public char getValue() {
    return this.value;
  }

  public boolean equals(Rank rank){
    if (this == rank){
      return true;
    }
    return false;
  }

  public String toString(){
    return "(" + this.value + ")";
    }

  public int compareTo(Rank rank) {
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
