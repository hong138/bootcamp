public class Circle {
  // lable IS NOT object reference
  // String object "LAB" exists, even though there is no Circle object created.
  private static String lable = "LAB"; // stack memory
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public static String getLabel(){
    return lable;
  }

  // !!!!!
  // static method NEVER return instance variable
  // public static double getRadius2(){
  //   return this.radius;
  // }

  public String getLabel2(){
    return lable;
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

    // because "label" is a static variable, so it does not belongs to any Circle object.
    // Way to static method.
    Circle.getLabel();
    

    // Way to instance method.
    new Circle(3.3).getLabel2(); // return static variable
    System.out.println(Circle.getLabel());
    System.out.println(new Circle(3.3).getLabel2());
  }
}
