

public class DemoCharInt {
  public static void main(String[] args) {
    char c = 'A';
    int x = c; // upcasting / promotion
    System.out.println(x); // 65 (ASCII code)

    // char c2 = x; // not ok, downcasting
    char c3 = '0';
    int x2 = c3;
    System.out.println(x2); // 48

    // char[] -> String.class
    System.out.println("hello".substring(0,2));

    // long -> float
    float f1 = 4L;
    System.out.println(f1);

    // long -> double
    double d1 = 5L;
    System.out.println(d1);

    // int -> float
    float f2 = 100;
    System.out.println(f2);

    // char -> float
    float f3 = 'c';
    System.out.println(f3); // (ASCII code)

    // char -> double
    double d2 = 'D';
    System.out.println(d2); // (ASCII code)

    // Char Math Operation -> + - * / 
    int sum = 'a' + 'a'; // char + char -> int + int
    System.out.println(sum); // 194 (ASCII code)

    // Counting Example
    char[] arr = new char[] {'a','y','z','a','b'};
    // Max count value = a
    int[] count3 = new int[26];
    for (int i = 0; i < arr.length; i++) {
        count3[arr[i] - 97]++;
    } 
    int max = 0;
    char target = ' ';
    for (int i = 0; i < count3.length; i++) {
      if (count3[i] > max){
        max = count3[i];
        // int -> char
        // in Java, you can still downcast the value to lower level type by
        // explicitly conversion
        target = (char) (i + 97);
      }
    }
    System.out.println("Max count value = " + target);


    int s = 10000;
    char c2 = (char) s;
    System.out.println(c2);  // ?

    int s2 = 66000;
    char c4 = (char) s2;
    System.out.println(c4);  // ?

    // Overflow
    byte b1 = (byte) 128;
    System.out.println(b1); // -128
    b1 = (byte) 129;
    System.out.println(b1); // -127

  }
}
