public class JavaQuest6 {
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    for (int i = 0; i < 15; i++){
      int x = first + second;
      System.out.println(first);
      first = second;
      second = x;
      
    }

  }
}
