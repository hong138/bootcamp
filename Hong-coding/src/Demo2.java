
import Demo2.main.Weekday;

public class Demo2 {
  public static void main(String[] args) {
    int num1 = 15; // binary: 0101
    int num2 = 3; // binary: 0011
    
    int result = num1 ^ num2; // binary: 0110, decimal: 6
    
    System.out.println("Result of XOR operation: " + result); // Output: 6
  }
}
