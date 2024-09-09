import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // Min
    System.out.println(Math.min(7, 3)); // 3
    System.out.println(Math.min(6, 4)); // 4
    System.out.println(Math.min(5, 13)); // 5

    // Max
    System.out.println(Math.max(7, 3)); // 7
    System.out.println(Math.max(6, 4)); // 6
    System.out.println(Math.max(5, 13)); // 13

    int[] arr = new int[] {-3, 6, 4, 68, 96};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    System.out.println("Max= " + max); // 96

    // Find min value
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      min = Math.min(arr[i], min);
    }
    System.out.println("Min= " + min); // -3

    // ABS
    int[] arr2 = new int[] {-88, 5, 43, 89,-64}; 
    // Sum up of ABS value
    int sum = 0;
    for (int i = 0; i < arr2.length; i++) {
      sum += arr2[i] < 0 ? arr2[i] * -1 : arr2[i];
    }
    System.out.println(sum);

    sum = 0;
    for (int i = 0; i < arr2.length; i++){
      sum += Math.abs(arr2[i]);
    }
    System.out.println(sum);

    // sqrt()
    int x = 81;
    System.out.println(Math.sqrt(x));

    // Math.pow(double a, double b)
    double result = Math.pow(2.0, 2L);
    System.out.println(result);

    // Math.round() -> nearest integer (1 d.p.)
    System.out.println(Math.round(10.123456789)); // 10
    System.out.println(Math.round(10.523456789)); // 11

    System.out.println(Math.floor(3.9)); // 3
    System.out.println(Math.ceil(3.9)); // 4

    System.out.println(Math.log(2)); // 0.6931471805599453
    System.out.println(Math.log10(1000)); // 3.0

    double angleDegree = 45;
    double angleRadian = Math.toRadians(angleDegree);
    double sinValue = Math.sin(angleRadian);

    // random
    Math.random(); // 0.0 (inclusive) - 1.0 (exclusive)
    System.out.println(Math.random()); // examlple 0.939581759935895

    System.out.println(Math.round(Math.random() * 100)); // examlple 80

    System.out.println(new Random().nextInt(80) + 1);

    String y = "2020";
    String xxx = Integer.toBinaryString(y);







  }
}
