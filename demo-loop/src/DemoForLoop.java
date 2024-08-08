public class DemoForLoop {
  public static void main(String[] args) {
      int x = 3;
      x *= 3;
      x *= 3;
      x *= 3;
      System.out.println(x);

      int y = 3;
      for (int i = 0; i < 3; i--){ //(counter initialization; coutinue condition; counter +1)
        y = y * 3;
      }
      System.out.println(y);

      // Step 1  : int i = 0
      // Step 2  : i < 3 -> true
      // Step 3  : y = y * 3
      // Step 4  : i++ -> 1
      // Step 5  : i < 3 -> true
      // Step 6  : y = y * 3
      // Step 7  : i++ -> 2
      // Step 8  : i < 3 -> true
      // Step 9  : y = y * 3
      // Step 10 : i++ -> 3
      // Step 11 : i < 3 -> false
      // Step 12 : Exit the loop

      // Example 1
      // Print 5 times Hello World

      for (int i = 0; i < 5; i++){
        System.out.println("Hello World");
      }

      // Example 2
      // We can use i for other purpose.
      for (int i = 0; i < 6; i++){
        System.out.println(i);
      }

      // Example 3
      // Print all odd numbers between 0 - 10
      // Loop and if
      for (int i = 0; i < 11; i++) {
          if (i % 2 != 0){
            System.out.println(i);
          } 
      }

      // Example 4
      // 10, 8, 6, 4, 2
      // Approach 1

      for (int i = 10; i > 0; i--){
        if (i % 2 == 0){
          System.out.println(i);
        }
      }

      // Approach 2
      for (int i = 0; i < 10; i++){
        if (i % 2 == 0){
          System.out.println(10 - i);
        }
      }

      // Example 5
      // 
      String str = "abcdefghijk"; // the index of last character 'k' is length() - 1
      String str2 = "";
      // "acegik"
      for (int i = 0; i < str.length(); i++){
        if (i % 2 == 0){
          str2 += str.charAt(i);
        }
      }
      System.out.println(str2);

      // Example 6 - counter
      String s2 = "bbaaaacceeef";
      // 
      char target = 'e';
      int count = 0;
      // The number of character e is 3
      for (int i = 0; i < s2.length(); i++){
        if (s2.charAt(i) == target){
          count++;
        }
      }
      System.out.println("The numbers of character " + target + " is " + count);

      // Example 7 - counting
      // 1 - 100
      // how many numbers can be divided by 3 or divided by 4?
      int div3and4 = 0;

      for (int i = 1; i < 100; i++){
        if (i % 3 == 0 || i % 4 == 0){
          div3and4++;
        } 
      }
      System.out.println("There are " + div3and4 + " can be divided by 3 and 4 from 1 - 100");


      // Example 8
      // Find the total number, which sum up all add numbers and subtract all even numbers between 1 - 50

      int total = 0;
      for (int i = 1; i < 51; i++){
        if (i % 2 == 1){
          total += i;
        } else {
          total -= i;
        }
      }
      System.out.println(total);

      // Example 9
      String s3 = "abcdxyzijk";
      boolean found = false;
      int pos = -1;
      // Print the index of j. If j is not find, print -1

      for (int i = 0; i < s3.length(); i++){
        if (s3.charAt(i) == 'j'){
          found = true;
          pos = i;
        } 
      }
      int idx = -1;
      if (found) {
          idx = pos;
      }
      System.out.println("Position of j = " + idx);

      // Alternative
      System.out.println(s3.indexOf('j')); // 8

      // Example 10
      String s4 = "hello";
      // check if the last character is o ->
      char targetEndWidth = 'o';
      System.out.println(s4.charAt(s4.length() - 1) == targetEndWidth);

      System.out.println(s4.endsWith("o"));
      System.out.println(s4.startsWith("h"));
      System.out.println(s4.startsWith("e"));

      // substring
      String s5 = "abcdefghijk";
      // Find "def"
      System.out.println(s5.contains("def")); // true
      // Find the index between 2 and 4
      System.out.println(s5.substring(2, 5)); // cde
      System.out.println(s5.indexOf("abc")); // 0
      System.out.println(s5.substring(0, 3)); //abc

      // Example 11
      String s6 = "abcdefghijk";
      String subString = "def";
      // Don't use indexof() or contains()
      // for loop
      // Found or not found

      // Nested Loop
      for (int i = 0; i < 3; i++) {  // outer loop
        for (int j = 0; j < 2; j++) { // inner loop
          System.out.println("i=" + i + " , j= " + j);
            
        }
      }
      // i=0 , j= 0
      // i=0 , j= 1
      // i=1 , j= 0
      // i=1 , j= 1
      // i=2 , j= 0
      // i=2 , j= 1

      // Example 12
      // break
      for (int i = 0; i < 5; i++){
        System.out.println("hello");
        if (i >= 3){
          break;
        }
      }

      // Example 13
      // break - searching
      String s7 = "ijkdef";
      found = false;
      for (int i = 0; i < s7.length(); i++){
        if (s7.charAt(i) == 'k') {
          found = true;
          break; // break the loop
        }
      }

      // Example 14
      // coutinue - skip some patterns
      for (int i = 0; i < 50; i++){ // 0 - 49
        // if (i % 2 == 1) {}
        if (i % 2 == 0) {
          continue; // skip the rest of code for current iteration
        }
        if (i > 30) {
          break;
        }
        System.out.println(i); // odd number and < 30
      }

      // Example 15
      // *****
      for (int i = 0; i < 5; i++) {
          System.out.print("*");
      }
      System.out.println("");

      // Example 16
      // *****
      // ****
      // ***
      // **
      // *

      // Nested Loop (i and j)
      for (int i = 0; i < 5; i++) {
        for (int j = 5; j > i; j--){
         System.out.print("*");
        }
        System.out.println("");
      }
      


    }
}
