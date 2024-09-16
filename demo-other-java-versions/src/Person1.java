// !!! immutable - final attributes
public record Person1 implements Walkable(String name, int age) {

  public static final Double PI = 3.14;

  public static int sum(int a, int b) {
    return a + b;
  }

  @Override
    public String name() {
  return "abc";
  }

// Support Custom Method
}
