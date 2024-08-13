
import java.util.Arrays;



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
    b1 = (byte) 5568;
    System.out.println(b1); // -64

    // double -> int (precision loss)
    double d10 = 10.25;
    int x5 = (int) d10;
    System.out.println(x5); // 10.25 -> 10
    d10 = 10.99;
    x5 = (int) d10;
    System.out.println(x5); // 10.99 -> 10

    // overflow + for loop (careless mistake)
    // for (byte i = 0; i < 128; i++) {
    //   System.out.println("hello");
    // }

    byte b20 = 7;
    int i20 = 8;
    boolean result = b20 < i20; 

    // byte b21 = 128; // compile error, Not overflow;
    byte b21 = 127;
    int i21 = 128;
    byte b22 = (byte) i21; // overflow


    int[] arr2 = new int[3];
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr2.length; i++) {
      if (arr2[i] > max){
        max = arr2[i];
      }
    }

    long l2 = Long.MIN_VALUE; // -9223372036854775808
    System.out.println(l2); // 2^-63

    // Arrays.copyof()
    // Problem
    // arr4 -> obj ref
    // int array object
    int[] arr4 = new int[] {1,2,3};
    arr4 = new int[] {2,3,4};

    // Example 1
    // We have 2 object reference, but one object
    int[] arr21 = new int[] {1,2,3};
    int[] arr22 = arr21; // pass by reference
    System.out.println(arr21[2]);
    System.out.println(arr22[2]);

    arr21[1] = 100;
    System.out.println(arr22[1]);

    // Example 2
    int x1 = 10;
    int x4 = x1; // pass by value
    System.out.println(x4);

    x1 = 100;
    System.out.println(x1); 
    System.out.println(x4);

    // Example 3
    String s1 = "abc";
    String s3 = s1; // pass by value

    s1 = "def";
    System.out.println(s1); // def
    System.out.println(s3); // abc

    // Conclusion
    // 8 Primitives + 8 Wrapprer Classes + String -> Pass by value
    // Other than that -> Pass by reference

    // For Pass by reference -> Example 1
    // For Pass by value -> Example 2 & 3

    // How to backup an array?
    // Arrays.copyOf()
    // Heap memory -> create another int array
    int[] backupArray = Arrays.copyOf(arr21, arr21.length); // define the length of new array
    System.out.println(Arrays.toString(backupArray));

    // Bubble Sort/ Insertion Sort (Nested Loop)
    int [] beforeSort = new int[] {30, -3, 55, 60, -89, 64, 100};
    Arrays.sort(beforeSort); // performance: nlogn
    System.out.println(Arrays.toString(beforeSort)); // [-89, -3, 30, 55, 60, 64, 100]
    










  }
}
