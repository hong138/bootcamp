import java.util.Arrays;

public class HongQuestion {
  public static void main(String[] args) {
    
    // Demo For Loop 
    // Why this condition is a mistake? infinite loop?
    // * Mistake in condition (i >= 0)
    // for (int i = 0; i >= 0; i++) {
    //   System.out.println("hello");
    // }


    // Demo Array
    // Given int value: 0 < x < 9
    int[] arr20 = new int[] {9, 4, 9, 9, 2, 2, 3, 9, 3};
    // Find the Max. Count -> 4
    // Find the Max. Count's Value -> 9

    int[] counts = new int[10];
    for (int i = 0; i < arr20.length; i++) {
        counts[arr20[i] - 10]++; // why need this (- 10)
    }
    System.out.println(Arrays.toString(counts)); // [0, 0, 2, 2, 1, 0, 0, 0, 0, 4]
    int max2 = 0;
    int target = 0;
    for (int i = 0; i < counts.length; i++) {
        if (counts[i] > max2){
          max2 = counts[i];
          target = i + 10;
        }
    }
    System.out.println("Max. Count's value=" + target);


  }
}
