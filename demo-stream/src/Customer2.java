public class Customer2 {
  private String name;
  private int age;

  public Customer2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Customer2(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.age;
  }
}
