public class DemoRecord {
  public static void main(String[] args) {
    // !!! Record (Java 16), supports:
    // ! Read Only
    // 1. All-arg constructor
    Person1 person = new Person1("John", 18);
    // getter
    System.out.println(person.name()); // getter
    System.out.println(person.age()); // getter
    // 3. No setter
    // 4. No empty constructor
    // Person1 person1 = new Person1();
    // 5. Support @Override - i.e. getter
    // 6. Attributes by default is "final"
    // 7. toString
    System.out.println(person.toString());
    // 8. equals(), hashCode()
    System.out.println(new Person1("Peter", 20).equals(new Person1("Peter", 20))); // true
    System.out.println(new Person1("Peter", 20).hashCode() == new Person1("Peter", 20).hashCode()); // true
    // 9. static variable & methods
    System.out.println(Person1.sum(3, 2));
    System.out.println(Person1.PI);
    // 10. extends? implements?
    Object obj = new Person1("Peter", 20);
    Walkable person2 = new Person1("Peter", 20);

    // 11. As parent class?
    // !!! Cannot be extended

  }
}
