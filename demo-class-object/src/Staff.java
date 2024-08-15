public class Staff {
  // 1. attributes
  private int id;
  private double salary;
  private String firstName;
  private String lastName;
  private double height;
  private double weight;

  // 2. emtry constructor implicitly exists
  public Staff(){
    System.out.println("Creating staff object ...");
    this.salary = 20000;
    // You can perform any logic here..
  }

  // Class may have more than one constructor
  // constructor signature
  // All arguments (parameters) constructor
  public Staff(int id, double salary, String firstName, String lastName, double height, double weight){
    this.id = id;
    this.salary = salary;
    this.firstName = firstName;
    this.lastName = lastName;
    this.height = height;
    this.weight = weight;

  }

  // 3. instance method
  // getter
  // setter

  public void setHeight(double height){
    this.height = height;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  // Presenetation
  public String getFullName(){
    return this.firstName + " " + this.lastName;
  }

  public double getBMI(){
    return this.weight/ Math.pow(this.height, 2.0);
  }

}
