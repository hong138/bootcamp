public enum Color {
  RED('R'), GREEN('G'), BLUE('B'),;

  private char value;

  private Color(char value){
    this.value = value;
  }

  public char getValue(){
    return this.value;
  }

  public static Color get(char value){
    for (Color color : values()) {
      if (color.getValue() == value)
        return color;
    }
    throw new IllegalArgumentException("char value is invalid. value=" + value);
  }

  public static void main(String[] args) {
    try {
      Color.get('r');
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
