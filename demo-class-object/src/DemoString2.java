public class DemoString2 {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";
    String s3 = new String("hello");

    // "==" always checking if they are in the same address
    System.out.println(s == s2); // true
    System.out.println(s == s3); // false

    Integer a = 13;
    Integer a2 = 13;
    Integer a3 = new Integer(31);
    System.out.println(a == a2); // true
    System.out.println(a == a3); // false

    // valueOf() -> Pool
    String s11 = String.valueOf("abc"); // Pool
    String s12 = "abc"; // Pool
    System.out.println(s11 == s12);

    // Summary
    // 1. valueOf() -> put into Pool
    // 2. new String() -> NOT put into Pool
    // 3. "" -> put into Pool
    // 4. new String().intern() -> put into Pool

    Integer n1 = 127;
    Integer n2 = 128;

    System.out.println(n1.equals(n2)); // false
    System.out.println(n1.compareTo(n2));// -1

    System.out.println(n1 == n2); // false

    // Within -128 to 127 (Pool)
    Integer n3 = 127;
    System.out.println(n1 == n3); // true

    // Outside -128 to 127 (No Pool)
    Integer n4 = 128;
    System.out.println(n2 == n4); // false
  }
}
