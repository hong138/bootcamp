public class StringIndexOutOfBound {
  public static void main(String[] args) {
    // char[]
    int idx = 3;
    try {
      "abc".charAt(idx);
      // substring
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("idx is out of bound");
    }
  }
}