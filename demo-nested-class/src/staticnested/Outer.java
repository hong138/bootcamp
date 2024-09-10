package staticnested;

// This example is to explain "static nested class"
public class Outer {
  private int x;

  public Outer(int x){
    this.x = x;
  }
  
  public int getX(){
    return this.x;
  }
  // !!! StaticNestedClass is completely different to Outer.class
  public static class StaticNestedClass{
    public static void print1(){
      // !!! Cannot read or write Outer.class
      System.out.println(x);
    }

    public static void print2(){
      // !!! Cannot read or write Outer.class
      System.out.println(x);
    }
  }

  public static void main(String[] args) {
    // New Object for StaticNestedClass
    StaticNestedClass sno = new StaticNestedClass();
    sno.print2();

    // New Object for Outer
    Outer outerObject = new Outer(10);
    System.out.println(outerObject.getX());
    
  }
}
