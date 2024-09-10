public class ExceptionTrial {
  public static void main(String[] args) {
    int x = 4;
    int y = 0;
    String s = "trytry";
    try {
      add(x, y);
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception...");
    } catch (NullPointerException e){
      System.out.println("Null Pointer Exception...");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Illegal Access Exception...");
    } catch (RuntimeException e){
      System.out.println("Runtime Exception...");
    } finally {
      System.out.println("---------------");
    }
  }

  public static int add(int x, int y){
    return x / y;
}
}
