public class DemoFinally {
  public static void main(String[] args) {
    try {
      System.out.println("try start"); // 1
      "abc".charAt(3);
      System.out.println("try end");
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Caught the Exception"); // 2
    } finally{
      System.out.println("Finally...."); // 3
    }
    System.out.println("program ends..."); // 4
    System.out.println("---------------");


    try {
      System.out.println("try start"); // 1
      "abc".charAt(2);
      System.out.println("try end"); // 2
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Caught the Exception");
    } finally{
      System.out.println("Finally...."); // 3, happy or unhappy path still come here
    }
    System.out.println("program ends..."); // 4
  }
}
