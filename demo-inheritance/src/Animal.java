public class Animal {
  private int age;
  private String name;

  public Animal(){

  }

  public Animal(int age, String name){
    this.age = age;
    this.name = name;
  }

  // getter
  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(){
    this.age = age;
  }

  public void setName(){
    this.name = name;
  }

  public void eat(){
    System.out.println("Animal is eating");
  }

  public void walk(){
    System.out.println("Animal is walking");
  }
}
