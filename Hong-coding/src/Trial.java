public class Trial {
  public static final int StaticFinal = 5;
  public static int sta;
  public final int fin;

  public Trial(int value){
    this.fin = value; 
    // Constructor can assign value to final variable
    // Constructor can assign value to static variable
    // static final variable should be create before object creation
  }

  public static void staExample(int obj2){
    sta = obj2 * obj2; 
    // Static method never access instance variable
    // Static method can access static variable
  }


  public static void main(String[] args) {
    Trial obj1 = new Trial(10);
    Trial obj2 = new Trial(20);

    System.out.println(StaticFinal);
    System.out.println(obj1.fin);
    // System.out.println(Trial.staExample(obj2));
  }

}
