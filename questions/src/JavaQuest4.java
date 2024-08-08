public class JavaQuest4 {
  public static void main(String[] args) {
    // Print the first 10 numbers from 0:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0
    int count = 0;
    for (int i = 1; i < 100; i++) { // You cannot change this line
      if (i % 2 == 0 && i % 3 == 0 && i > 0) {
        System.out.print(i + " ");
        count++;
        if (count == 10) {
          break;
        }
      }
    }
  }
}
