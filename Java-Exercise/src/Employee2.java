public class Employee2 {
  private String name;
  private String department;

  public Employee2 (String name, String department){
    this.name = name;
    this.department = department;
  }

  public String getName(){ 
    return this.name;
  }

  public String getDepartment(){
    return this.department;
  }

  @Override
  public String toString(){
    return this.name;
  }
}
