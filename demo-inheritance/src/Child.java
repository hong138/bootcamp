public class Child extends Parent {
  private double y;

  // Two meaning of "super"
  // 1. call parent class constructor
  // 2. super class object address

  public Child(){
    super();
  }

  public Child(String s){
    super(s);
  }

  public Child (int x, byte age, double y){
    super(x, age);
    this.y = y;
  }


  public byte getAge(){
    return this.age; // super.age
  }

  public static void main(String[] args) {
    // Once you decided to extend a parent class
    // all child object has an "inside object"
    // So, all child constructor has to "super"
    Child child = new Child();

    Child c2 = new Child(10, (byte) 3, 52);

    Child c3 = new Child();
  }
}
