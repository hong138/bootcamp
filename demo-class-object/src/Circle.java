public class Circle {
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  // Presentataion
  public double area(){
    return Math.pow(radius, 2.0) * Math.PI;
  }

  public double circumference(){
    return 2 * Math.PI * radius;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(4.0);
    System.out.println(circle.area());
    System.out.println(circle.circumference());
  }
}
