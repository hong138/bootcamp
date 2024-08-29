// Interface:
// 1. 100% abstraction - no implementation in Interface
// 2. No attriable
// 3. Allow and implicit "public static fianl" only
// 4. No constructor
// 5. After Java 8, default & static keyword inside Interface
public interface Walkable {
  // Constant
  public static final double PI = 3.14;

  // This is Constant too
  int x = 64; // implicitly "public static final"

  public int v = 40; // public static final
  static final int w = 98; // public static final
  static int y = 20; // public static final
  final int z = 30; // public static final

  // After Java 8
  // It is instance method, by default inherited by the implementation class
  // Can be overriden
  default int sum(int x, int y){
    return x + y;
  }

  static int subtract(int x, int y){
    return x - y;
  }

  // default static abc(){}

  void walk();

  public static void main(String[] args) {
    System.out.println(Walkable.x);
    System.out.println(Walkable.PI);

    // How to call sum()
    System.out.println(new Person().sum(3, 4));
    System.out.println(Walkable.subtract(3, 1));

    new Person().walk();
  }
}
