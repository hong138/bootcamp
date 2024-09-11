public class ExceptionChainExample2 {
  // !!! No Exception
  public static void main(String[] args) {
    method1(10, 0);
  }

  public static int method1(int x, int y){
    return method2(x, y);
  }

  public static int method2(int x, int y){
    int a = 100;
    try {
      return x / y;
    } catch (ArithmeticException e) { // catch
      System.out.println(e.getMessage());
      a = -1;
    }
    return a;
    
  }
}
