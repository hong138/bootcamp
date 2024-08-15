import java.util.Random;

public class DemoWhileLoop {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 5; i++) {
        sum += i;
      }
      System.out.println(sum);

    // while
    int count = 0;
    sum = 0;
    while (count < 6){ // when count == 6, exit loop
      sum += count;
      count++;
    }
    System.out.println(sum); // 15


    int x = 3;
    int sum2 = 0;
    while (x % 3 == 0 && x < 100){
      sum2 += x;
      x++;
    }
    System.out.println(sum2);

    // random
    int value = new Random().nextInt(5) + 1;
    System.out.println(value);

    // Guess a number
    // Scanner scanner = new Scanner(System.in);
    // int number = -1;

    // while (number != value) {
    //   System.out.println("Please input a number between 1 - 5: ");
    //   number = scanner.nextInt(); // capture user input
    // }
    // System.out.println("Congrats!!!");

    // leetcode
    int code = 1234;

    char[] codes = new char[10000] ; //['1','2','3','4']

    // Approach 1
    // char[] codes = new Integer(code).toString().toCharArray();
    // System.out.println(Arrays.toString(codes));

    // Approach 2
    // Tips: % and /
    // how to convert 1 to '1'
    // int a = code;
    // int arrLength = 0;
    // while (a > 0){
    //   // 1234 % 10 -> 4
    //   // (char)(a % 10 + '0');
    //   a = a / 10;
    //   arrLength++;
    // }
    // codes = new char[arrLength];
    // a = code;
    // int idx = 0;
    // while (a > 0){
    //   codes[idx++] = (char)(a % 10 + '0');
    //   idx++;
    //   a = a / 10;
    //   arrLength++;
    // }
    // System.out.println(Arrays.toString(codes));

    // reverse
    // char backup = ' ';
    // for (int i = 0; i < codes.length / 2 ; i--) {
    //     backup = codes[i];
    //     codes[i] = codes[codes.length - i - 1];
    //     codes[codes.length - i - 1] = backup;
    // }
    // System.out.println(Arrays.toString(codes));

    count = 0;
    sum = 0;

    while (true) { // by default infinite loop
      sum += count;
      count++;
      if (count > 4);
        break;
    }
    System.out.println(sum);

    // 
    int num = 54321;
    String result = "";
    while (num > 0) { 
      result += num % 10; // retrieve, String + int
      num /= 10; // 54321 -> 5432 -> 543 -> 54 -> 5 -> 0 (exit)
    }
    System.out.println(result);















  }
}
