package shape;

import java.math.BigDecimal;

public class Triangle extends Shape{
  private double base;
  private double height;

  public Triangle(){}

  private Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  public Triangle(double base, double height, Color color){
    super(color);
    this.base = base;
    this.height = height;
    // super(color);
  }

  public double area(){
    return BigDecimal.valueOf(this.base).multiply(BigDecimal.valueOf(this.height)).divide(BigDecimal.valueOf(2.0)).doubleValue();
  }
  

  public static void main(String[] args) {
    Triangle triangle = new Triangle(2.5, 3.5);
    System.out.println(triangle.area()); // 4.375

    Triangle t2 = new Triangle(3.0, 4.0, Color.GREEN);
    System.out.println(t2.getColor()); // GREEN

  }
}
