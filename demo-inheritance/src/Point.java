import java.util.Objects;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Point))
     return false;
    Point point = (Point) obj;
    return Objects.equals(this.x, point.getX()) && Objects.equals(this.y, point.getY());
  }

  @Override
  public String toString(){
    return "Point(x=" + this.x + ", y=" + this.y + ")";
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.x, this.y);
  }

  // !!! Method signature is Case Sensitive
  // !!! But you should NOT design the method name like this
  // !!! Confuse when you call the method
  // public int hashcode(){
  //   return -1;
  // }

  public static void main(String[] args) {
    // before override equals(), it is false
    Point p1 = new Point(1, 1);
     System.out.println(p1.equals(p1));

    Person person = new Person(new Point(2, 1));

    // asking if the person located in Point(2, 1)
    // I am not asking if the point object
    if (person.getPoint().equals(new Point(2, 1)));
    
  }
}
