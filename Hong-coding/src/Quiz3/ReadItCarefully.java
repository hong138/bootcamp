package Quiz3;

public class ReadItCarefully {
  
  static final String string = "IamFinalString";
  private static char c = 'C';

  static {
    char[] chars = string.toCharArray();
    c = chars[2];
  }

  public static void main(String[] args) {
    ReadItCarefully ric = new ReadItCarefully();
    System.out.println(ric.c);
  }
}
