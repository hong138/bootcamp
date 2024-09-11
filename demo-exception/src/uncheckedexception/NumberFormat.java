package uncheckedexception;
public class NumberFormat {
  public static void main(String[] args) {
    try {
      double dp = Double.parseDouble("100.3");
      System.out.println(dp);
      double dp2 = Double.parseDouble("100..8"); // runtime error, goes to "catch" session
      System.out.println(dp2);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage()); // multiple points
    }
    

  }
}
