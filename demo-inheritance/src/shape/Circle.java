package shape;

import java.math.BigDecimal;

// The implications of "extends Shape": obtains color attribute
public class Circle extends Shape { // Circle.class -> concrete class has no implement all abstract method
  private double radius;

  public Circle(double radius){
    super();
    this.radius = radius;
  }

  public Circle(double radius, Color color){
    super();
    this.radius = radius;
  }

  public double perimeter(){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(Math.PI)).multiply(BigDecimal.valueOf(2.0)).doubleValue();
  }

  // Override -> Same Method Signature
  // "@" -> annotation (for compiler to read)
  @Override // Ask compiler to check if the parent class contain area() method.
  // if you do not annotate it, it still override the method, because they are same method signature. 
  public double area(){
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3.5);
    System.out.println(circle.area()); // 38.48451000647496
    System.out.println(circle.perimeter()); // 21.991148575128552
  }
}
