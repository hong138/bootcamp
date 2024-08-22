
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // A special type in Java
    // Problem (double, float in Math Operation +,-,*,/)
    System.out.println(0.2 + 0.1); // 0.30000000000000004
    System.out.println(0.2 - 0.1); // 0.1
    System.out.println(0.2 * 0.1); // 0.020000000000000004
    System.out.println(0.2 / 0.1); // 2.0

    // BigDecimal (double)
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    // instance
    double result = bd1.add(bd2).doubleValue();
    System.out.println(result); // 0.3

    // multiply
    double result2 = bd1.subtract(bd2).doubleValue();
    double result3 = bd1.multiply(bd2).doubleValue();
    double result4 = bd1.divide(bd2).doubleValue();

    System.out.println(result2); // -0.1
    System.out.println(result3); // 0.02
    System.out.println(result4); // 0.5

    // for most the cases, you should start with a double primitive
    bd1 = BigDecimal.valueOf(10);
    bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP).doubleValue()); // 3
    System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP).doubleValue()); // 3.33
    System.out.println(bd1.divide(bd2, 2, RoundingMode.CEILING).doubleValue()); // 3.34
    // System.out.println(bd1.divide(bd2).setScale(2, RoundingMode.HALF_UP).doubleValue());

    double m = 0.0;
    if (m == 0.0){
      result = 0.0;
    } else{
    System.out.println(bd1.divide(BigDecimal.valueOf(0.0), 2, RoundingMode.HALF_UP).doubleValue());
    }
    // java.lang.ArithmeticException: / by zero
    // System.out.println(bd1.divide(BigDecimal.valueOf(0.0), 2, RoundingMode.HALF_UP).doubleValue());

    System.out.println(BigDecimal.valueOf(3.440).setScale(2, RoundingMode.UP)); // 3.44
    System.out.println(BigDecimal.valueOf(3.441).setScale(2, RoundingMode.UP)); // 3.45
    System.out.println(BigDecimal.valueOf(3.444).setScale(2, RoundingMode.HALF_UP)); // 3.44
    System.out.println(BigDecimal.valueOf(3.445).setScale(2, RoundingMode.HALF_UP)); // 3.45

    // equals()
    System.out.println(BigDecimal.valueOf(10L).equals(BigDecimal.valueOf(10.0))); // false
    System.out.println(BigDecimal.valueOf(10.0).equals(BigDecimal.valueOf(10.0))); // true
    System.out.println(BigDecimal.valueOf(10L).doubleValue() == BigDecimal.valueOf(10.0).doubleValue()); // true

    // compareTo()
    System.out.println(BigDecimal.valueOf(10L).compareTo(BigDecimal.valueOf(10.0))); // 0
    System.out.println(BigDecimal.valueOf(11).compareTo(BigDecimal.valueOf(10.0))); // 1
    System.out.println(BigDecimal.valueOf(9).compareTo(BigDecimal.valueOf(10.0))); // -1

    // new BigDecimal
    double d1 = new BigDecimal("0.1").add(new BigDecimal("0.2")).doubleValue();
    System.out.println(d1); // 0.3

    double d2 = new BigDecimal(0.1).add(new BigDecimal(0.2)).doubleValue();
    System.out.println(d2); // 0.30000000000000004

    double d3 = BigDecimal.valueOf(0.1d).add(BigDecimal.valueOf(0.2f)).doubleValue();
    System.out.println(d3); // 0.30000000447034836



  }
}
