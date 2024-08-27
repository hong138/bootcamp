package shape;

// public class Shape {
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
  public abstract double area();

  public Color getColor(){
    return this.color;
  }


  public static void main(String[] args) {
    // Shape shape = new Shape();
    // System.out.println(shape.area()); // -1.0

    Object object = new Object(); // concrete class and top-most class
    object.equals(object);

    // 
    Staff ss = new
  }
}
