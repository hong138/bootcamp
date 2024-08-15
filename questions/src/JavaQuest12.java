
import java.util.Arrays;

public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] answers = twoSum(new int[] { 2, 7, 11, 15 }, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum

    System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3));
  }

  public static int[] twoSum(int[] nums, int target){
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] + nums[j] == target){
            return new int [] {i, j};
          }
      }
    }
    return new int[] { -1, -1 };
  }
}
