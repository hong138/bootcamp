public class Person {
  private String name;
  private int age;

  // default emtry constructor, only if you did not create another constructor
  // emtry, all-args
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  // You can just read the attribute from object, if there is no setter.
  // You cannot override/rewrite the attribute anymore after object creation.
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  // Testing, Memory Processing
  public static void main(String[] args) {
    // memory
    // When you create one all-arg constructor only,
    // complier would not create the emtry constructor for you anymore
    // Person person = new Person(); // complier error

    Person person = new Person("John", 30);
    System.out.println(person.getName());
    System.out.println(person.getAge());

  }


}
