public class Customer {
  private int age;

  public Customer(int age){
    this.age = age;
  }

  public void setAge(int age){
    this.age = age;
  }

  // Presentation
  public boolean isElderly(){
    return this.age >= 66;
  }

  public static void main(String[] args) {
    Customer customer = new Customer(30);

    // for void method, there is no return value.
    // System.out.println(customer.setAge(70));

    customer.setAge(70);
    System.out.println(customer.isElderly());

    // isElderly() is better design, because
    // 1. method is for accuracy running repeatedly
    // 2. readabilitay
    if (customer.isElderly()){ // customer.getAge() >= 66
      
    }
  }
}
