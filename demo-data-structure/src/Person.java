import java.util.Objects;
import java.util.PriorityQueue;

public class Person implements Comparable<Person>{
  private String name;
  private int age;
  private HKID hkid; // person.getHKID().getValue()

  public Person (String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  // public HKID getHKID(){
  //   return this.hkid;
  // }

  public boolean isElderly(){
    return this.age >= 65;
  }

  @Override
  public int compareTo(Person person) {
    // this -1 vs person 1
    if (this.isElderly() && !person.isElderly())
      return -1;
    if (!this.isElderly() && person.isElderly())
      return 1;
    return this.age > person.getAge() ? -1 : 1;
  }

  @Override
  public String toString(){
    return "" + this.name + " (" + this.age + ")";
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Person))
      return false;
      Person person = (Person) obj;
      return Objects.equals(this.name, person.getName()) && Objects.equals(this.age, person.getAge());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.age);
  }
public static void main(String[] args) {
    PriorityQueue<Person> person = new PriorityQueue<>();
    person.add(new Person("John", 65));
    person.add(new Person("Mary", 60));
    person.add(new Person("Tony", 70));
    person.add(new Person("Alan", 62));
    person.add(new Person("Peter", 68));
    person.add(new Person("Andy", 55));
    person.add(new Person("Annie", 20));
    System.out.println(person); // [Tony (70), Peter (68), John (65), Mary (60), Alan (62), Andy (55), Annie (20)]

    // poll() -> call compareTo()
    System.out.println(person.poll()); // Tony (70)
    System.out.println(person.poll()); // Peter (68)
    person.add(new Person("Alex", 18));
    person.add(new Person("Sally", 80));
    System.out.println(person.poll()); // Sally (80)
    System.out.println(person.poll()); // John (65)
    System.out.println(person.poll()); // Alan (62)
}
}
