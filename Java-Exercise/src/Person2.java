public class Person2 {
  private String name; 
  private String gender;

  public Person2(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public String getName() {
    return this.name;
  }

  public String getGender() {
    return this.gender;
  }

  @Override
  public String toString(){
    return this.name;
  }
}
