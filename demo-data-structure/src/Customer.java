import java.util.Objects;

public class Customer {
  private String name;

  public Customer(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return this.name;
  }

  @Override 
  public boolean equals(Object obj){ // same name -> true, otherwise false
    if (this == obj)
      return true;
    if (!(obj instanceof Customer)) // before downcast, we usually conside to use "instanceof"
      return false;
    // because we do not have staff object, so we cannot getName()
    // Parent -> Child (downcast);
    Customer customer = (Customer) obj;
    return Objects.equals(this.name, customer.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }
}
