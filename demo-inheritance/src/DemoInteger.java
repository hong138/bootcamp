public class DemoInteger {
  public static void main(String[] args) {
    // Every Class should have its own equals(), hashCode(), toString()
    Integer x = 3;
    System.out.println(x.equals(3)); // true
    System.out.println(x.hashCode()); // 3
    System.out.println(x == 3); // true

    Integer x2 = new Integer(3);
    Integer x3 = Integer.valueOf(3); // true

    // Comparing address, because checking object reference.
    System.out.println(x3 == x); // true
    System.out.println(x2 == x); // false
    System.out.println(x3 == x2); // false

    // Comparing int value
    System.out.println(x2 == 3); // true
    System.out.println(x2 >= 3); // result OK, but you should not.

    // You should
    // Option 1
    System.out.println(x.compareTo(3) == 0 || x.compareTo(3) > 1);
    // Option 2
    System.out.println(x.intValue() >= 3);

  }
}
