package shape;

// public class Shape {

import java.math.BigDecimal;

  public abstract class Shape{

  public Color color;

  public Shape(){}

  public Shape(Color color){
    this.color = color;
  }

  // public double area(){
  //   return -1.0d;
  // }

  // After defining the concrete class (non-abstract) become abstract
  // 1. We can create abstract method (without implementation)
  // 2. Cannot create object for Abstract Class
  // 3. Abstract class can still hold its own attributes
  // 4. The constructor in abstract class is for child class invoke
  // 5. All abstract method must be public
  abstract double area();

  public Color getColor(){
    return this.color;
  }

  public static double totalArea(Shape[] shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes){
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }


  public static void main(String[] args) {
    // Shape shape = new Shape();
    // System.out.println(shape.area()); // -1.0

    Object object = new Object(); // concrete class and top-most class
    object.equals(object);

    Shape circle = new Circle(1.0); // Polymorphism
    Shape triangle = new Triangle(1.0, 1.0, Color.BLUE);

    Shape[] shapes = new Shape[] {circle, triangle};
    System.out.println(Shape.totalArea(shapes));

    double areaAtIndex0 = shapes[0].area();
    double areaAtIndex1 = shapes[1].area();
    System.out.println(areaAtIndex0);
    System.out.println(areaAtIndex1);

  }
}
