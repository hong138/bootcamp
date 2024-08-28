// keyword: extends
public class Cat extends Animal{
  private String color;

  // emtry constructor

  // In Java, we never inherit constructor from Parent Class
  // But we can call Parent constructor
  public Cat (int age, String name, String color){
    super(age, name);
    this.color = color;
  }
  
  public Cat(){}

  public Cat(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public void run(){
    this.eat();
  }

  @Override
  public void walk(){
    System.out.println("Cat is walking");
  }

  // implicitly
  public String getName(){
    return super.getName();
  }

  public String toString(){
    return "Cat(name=" + this.getName() + " age=" + this.getAge() + " color=" + this.getColor() + ")";
  }

  public static void main(String[] args) {
    // Parent Class -> Animal.class
    // Child Class -> Cat.class

    // child object inherits Parent object attributes & behaviors
    Cat cat = new Cat();
    // Cat object inherits Parent object
    System.out.println(cat.getAge()); // 0 (default value of int)
    System.out.println(cat.getColor()); // null (default value of String)

    Animal animal = new Animal();
    System.out.println(animal.getAge()); // 0
    // animal.getColor() ; // error

    Cat cat2 = new Cat("Yellow");
    System.out.println(cat2.getColor());
    System.out.println("---------------");

    Cat cat3 = new Cat(10, "Peter", "Black");
    System.out.println(cat3.toString());
    System.out.println("---------------");

    Cat cat4 = new Cat();
    cat4.eat();
    System.out.println(cat4);
    System.out.println("---------------");

    Animal cat5 = new Cat();
    cat5.walk(); // OK, 
    System.out.println(cat5);
    System.out.println("---------------");

    Animal dog = new Dog();
    dog.walk();
    System.out.println("---------------");

  }
}
