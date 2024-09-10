public class DemoParentException {
  // !!! 1. "Catch" can be multiple code block. Similar to "else if". Check it one by one.
  // !!! 2. "Catch" has Polymorphism concept
  public static void main(String[] args) {
    try {
      int x = 10 / 0;
      "abc".charAt(3);
    } catch (StringIndexOutOfBoundsException e) { // similar to else if 
      System.out.println("Caught StringIndexOutOfBoundsException ...");
    } catch (RuntimeException e){ // ArithmeticException come here
      System.out.println("Caught RuntimeException ...");
      if (e instanceof ArithmeticException) {
          System.out.println("It is arithmetic exception...");
      }
    } catch (Exception e){
      System.out.println("Other Exception ...");
    }
    System.out.println("Program ends....");
  }

}
