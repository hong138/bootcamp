package inner;

  public class Outer {
  private int x;

  public Outer(int x){
    this.x = x;
  }

  public int getX(){
    return x;
  }

  public class Inner {
    private double y;

  public Inner(double y){
    this.y = y;
  }

  public double getY(){
    return this.y;
    }

    // !!!
    public int getX(){
      return x;
    }
  }
  public static void main(String[] args) {
    // Approach 1: create outer object and its reference first
    Outer outer = new Outer(10);
    Outer.Inner inner = outer.new Inner(20.5);
    System.out.println(inner.getY());

    // Approach 2: create Inner Object directly
    Outer.Inner inner2 = new Outer(10).new Inner(20.5);
    System.out.println(inner2.getX());
    System.out.println(inner2.getY());
  }
}
