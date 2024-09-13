import java.util.ArrayList;
import java.util.List;

public class Customer2 {
  private String name;
  private int age;
  private List<Address> addresses;
  // !!! Bad idea
  // private Optional<Order> order;

  public Customer2(String name, int age, List<Address> addresses) {
    this.name = name;
    this.age = age;
    this.addresses = addresses;
  }

  public Customer2(String name, int age) {
    this.name = name;
    this.age = age;
    this.addresses = new ArrayList<>();
  }

  public List<Address> getAddresses() {
    return this.addresses;
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

  public static class Address {
    private String line1;
    private String line2;

    public Address(String line1, String line2) {
      this.line1 = line1;
      this.line2 = line2;
    }

    @Override
    public String toString() {
      return this.line1 + ", " + this.line2;
    }


  }
}
