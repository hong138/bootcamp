import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // 8 primitives + String
    int x  = 3;
    int x2 = 6;
    int x3 = -4;

    int max;
    if (x > x2) {
      if (x > x3) {
        max = x;   // 3
      } else {
        max = x3;   
      }
    } else { // x2 > x
      if (x2 > x3) {
        max = x2; // 6
      } else {
        max = x3;
      }
    }
    System.out.println("max=" + max); // 6

    // how about we compare 10 numbers?
    // You have to define the length of array before you use it.
    int[] arr = new int[3]; // 3 means the length of array
    // Assign the values to array
    arr[0] = 3;
    arr[1] = 6;
    arr[2] = -4;
    // print out all numbers from the array
    System.out.println(arr[0]); // 3
    System.out.println(arr[1]); // 6
    System.out.println(arr[2]); // -4
    // System.out.println(arr[3]); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    System.out.println(arr.length); // 3

    // for loop -> print the values in array
    for (int i = 0; i < arr.length; i++) { // 0 1 2
      // System.out.println(i);
      System.out.println(arr[i]); // 3 6 -4
    }

    // declare an array for double
    // for loop
    double[] arr2 = new double[5];
    arr2[0] = 16.1;
    arr2[1] = 3.4d;
    arr2[2] = 2.8f; // float -> double
    arr2[3] = -4.9;
    arr2[4] = 10; // int -> double
    // arr2[5] = 10.2; // java.lang.ArrayIndexOutOfBoundsException

    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }
    // char[], boolean[], byte[], short[], long[], float[], String[]

    // Example 1
    int[] arr3 = new int[3];
    arr3[0] = -3;
    arr3[1] = -6;
    arr3[2] = -4;
    // Find the max num from the array
    // Loop
    // int maxNum = -2_100_000_000;
    int maxNum = 0;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > maxNum) {
        maxNum = arr3[i];
      }
    }
    System.out.println("maxNum=" + maxNum); // 6

    // Example 2
    // Find the min. number
    int minNum = 2_100_000_000;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] < minNum) {
        minNum = arr3[i];
      }
    }
    System.out.println("minNum" + minNum); // -4

    // Example 3
    // Find the longest string.
    String[] strings = new String[3];
    strings[0] = "abcd";
    strings[1] = "hello";
    strings[2] = "12309000";
    String longestString = ""; // length = 0

    // code here ...
    // strings[i].length() -> A String Value length
    // strings.length -> string array length
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > longestString.length()) {
        longestString = strings[i];
      }
    }
    System.out.println("The longest string=" + longestString);

    // Example 4
    // prices.length = quantities.length
    double[] prices = new double[4];
    prices[0] = 10.3;
    prices[1] = 7.7;
    prices[2] = 1.5;
    prices[3] = 2.3;
    int[] quantities = new int[4];
    quantities[0] = 10;
    quantities[1] = 2;
    quantities[2] = 5;
    quantities[3] = 4;

    double totalAmount = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalAmount += prices[i] * quantities[i];
    }
    System.out.println("Total Amount=" + totalAmount);

    // Example 5
    // Average
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;
    // loop
    double total = 0.0;
    for (int i = 0; i < scores.length; i++) {
      total += scores[i]; // double + int
    }
    System.out.println("Average score=" + total / scores.length);

    // declare and initialize an array
    // approach 1
    String[] arr5 = new String[3];
    // approach 2
    String[] arr6 = new String[] {"abc", "def", "ijk"}; // length = 3
    // approach 3
    String[] arr7 = {"abc", "def", "ijk"};
    // arr6[3]; // error

    // Example 6 *****
    // from array to array
    int[] arr8 = new int[] {100, -20, 40, 33, 90, 44, 66};
    // Find all numbers that > 40 and divided by 3
    int[] answers = new int[7];
    int idx = 0;
    for (int i = 0; i < arr8.length; i++) {
      if (arr8[i] > 40 && arr8[i] % 3 == 0) {
        answers[idx++] = arr8[i];
      }
    }
    // Print out array
    System.out.println(Arrays.toString(answers)); // [90, 66, 0, 0, 0, 0, 0]

    // Example 7
    char[] arr9 = new char[2];
    arr9[0] = 'h';
    arr9[1] = 'a';
    char backup;
    // swap - by backup
    backup = arr9[0];
    arr9[0] = arr9[1];
    arr9[1] = backup;
    System.out.println(arr9[0]); // a
    System.out.println(arr9[1]); // h

    // Example 8
    // Move the first character to the tail
    char[] arr10 = new char[] {'9', '4', '3', '2', '1', '0'};
    // loop + swap
    // You cannot create another array
    char temp = arr10[0];
    
    for (int i = 0; i < arr10.length - 1; i++){
      arr10[i] = arr10[i+1];
    }

    arr10[arr10.length - 1] = temp;
    System.out.println(Arrays.toString(arr10)); // [4, 3, 2, 1, 0, 9]

  }
}
