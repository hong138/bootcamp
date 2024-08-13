public class DemoWrapperClass {
  public static void main(String[] args) {
      int x = 10; // 10 is an int value, x is variable
      
      // int -> Integer
      Integer i1 = 10; // i is an object reference
      Integer i2 = new Integer(10); // i2 -> obj ref, 10 is an object
      // object reference stores object address

      double d1 = i2.doubleValue();

      System.out.println(i2.compareTo(new Integer(11))); // -1

      // if you are going to comapre number object (Integer, Long, Short, Byte)
      Double d2 = new Double(3);
      System.out.println(d2.doubleValue()); // 3.0
      System.out.println(d2.toString()); // "3.0"
      System.out.println(d2); // 3.0

      String s = "hello"; // Java -> create String object
      String s2 = new String("hello");
      System.out.println(s2.length());
      System.out.println(s2.charAt(3));

      // Short, Long, Byte
      Long l1 = new Long(123);
      Long l2 = new Long(123L);
      Long l3 = new Long("123");
      System.out.println(l1); // 10
      System.out.println(l2); // 10
      System.out.println(l3); // 10
      
      Long l4 = new Long(40000);
      short s1 = l4.shortValue(); // simliar to down casting -> (short) l4
      System.out.println(s1); // -25536 -> overflow

      int x6 = new Double(10.5).intValue();
      System.out.println(x6); // 10 -> precision loss

      short s3 = new Double(40000.55).shortValue();
      System.out.println(s3); // -25536 (overflow + precision loss)

      // char -> Character
      Character c = 'a'; // auto-box, but actually it is calling "new"
      // int -> Integer
      Integer i5 = 10; // auto-box, but actually it is calling "new"
      Boolean b1 = true; // auto-box, new Boolean(true)
      b1 = new Boolean("true");
      b1 = new Boolean(false);

      // 8 primitives + 8 wrapper classes + String

      int[] arr = new int[] {1, 3, 6};
      Integer[] arr2 = new Integer[] {new Integer(1), new Integer(3), new Integer(6)};

      Integer[] arr3 = new Integer[] {1, 3, 6};

      Integer g = 10;
      if (g.equals(new Integer(10))){

      }

      Integer[] integers = new Integer[] {10, 8, 4, -3, 7};
      // Find the number of integers > 5
      int count = 0;
      for (int i = 0; i < integers.length; i++) {
        if (integers[i].compareTo(new Integer(5)) > 0){
          count++;
        }
      }
      System.out.println(count);

      Character[] characters = new Character[] {'a', 'e', '4', '6', '!', '%'};
      // Find the number of "number" in the array
      // 2
      // 
      int countNum = 0;

      for (int i = 0; i < characters.length; i++) {
        if (characters[i].charValue() >=48 && characters[i].charValue() <=57){
          countNum++;
        }
      }
      System.out.println(countNum);

      int result = Integer.parseInt("10");
      System.out.println(result);
      result = Integer.parseInt("hello"); // bug
      System.out.println(result); // java.lang.NumberFormatException









  }
}
