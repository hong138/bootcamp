public class Demo {
  public static void main(String[] args) {
    // memory
    int x = 3;

    // arr -> object reference -> object address
    // int array abject (length =2)
    int[] arr = new int[2];


    // cat -> object reference -> cat object address
    // Cat object in heap memory
    Cat cat = new Cat(); // 
    cat.setName("John");
    //System.out.println(cat.name); // Not ok, because "name" is private

    // if attribute is private, then you cannot read the attribute directly by obj ref.
    // For example, cat.name and cat.color

    Cat cat2 = new Cat(); // 
    String name = "Peter";
    cat2.setName(name);
    System.out.println(cat2.getName());

    cat.getName(); // return this.name
    cat.getName(); // return this.name

    cat.setColor("Black");
    cat2.setColor("White");
    System.out.println(cat.getColor());
    System.out.println(cat2.getColor());

    cat.setAge(5);
    cat2.setAge(7);
    System.out.println(cat.getAge());
    System.out.println(cat2.getAge());

    Staff staff = new Staff(); // staff() -> constructor
    staff.setHeight(1.70);
    staff.setWeight(65);
    // getBIM() -> class encapsulates complicated behavior
    System.out.println(staff.getBMI());

    Staff staff2 = new Staff("Kachu", "Pi", 1.5, 40);
    System.out.println(staff2.getBMI());


  }
}
