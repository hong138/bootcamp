import java.math.BigDecimal;

public class Calculator {
  private double x;
  private double y;

  public Calculator(){

  }

  public Calculator(double x, double y){
    this.x = x;
    this.y = y;
  }


  // c.setX(3)
  // c.setY(5)
  // c.sum()
  // !!! Understand why sum() and sum(double x, double y) co-exists
  public double sum(){ // method signature
    return BigDecimal.valueOf(this.x).add(BigDecimal.valueOf(this.y)).doubleValue();
  }

  // static method design, but it is an instance method
  public double sum(double x, double y){
    // BigDecimal
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static double staticSum(double x, double y){
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static void main(String[] args) {


    Calculator c = new Calculator(); // new object
    // sum(3,7); // static method
    System.out.println(c.sum(1, 3));

    System.out.println(Calculator.staticSum(3, 5));

    Calculator c2 = new Calculator(3,6);
    System.out.println(c2);

    Calculator c3 =

    


  }
}
