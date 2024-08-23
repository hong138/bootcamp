package valueReference;

import java.util.Arrays;

public class DemoPassByReference {
  public static void main(String[] args) {
    int[] arr = new int[] {10, 20, -3, 9};
    // move the max value to the tail -> [x, x, x, 20]
    // algorithm
    moveMaxToTail(arr);
    System.out.println(Arrays.toString(arr));

    String s = "hello";
    String s2 = toUpperCase(s);
    System.out.println(s2);

    
  }

  // String object -> pass by value
  public static String toUpperCase(String s){
    return s.toUpperCase();
  }

  // So, array is one of type that is "pass by reference"
  public static void moveMaxToTail(int[] x){
    int temp;
    for (int i = 0; i < x.length - 1; i++) {
    if (x[i] > x[i + 1]){
      temp = x[i];
      x[i] = x[i + 1];
      x[i+1] = temp;
    }
    }
  }
}
