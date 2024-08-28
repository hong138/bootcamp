
class Animal2 {
  public void makeSound() {
      System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal2 {
  public void makeSound() {
      System.out.println("Dog barks");
  }
}

class Cat extends Animal2 {
  public void makeSound() {
      System.out.println("Cat meows");
  }
}

public class InstanceOfExample {
  public static void main(String[] args) {
      Animal2 dog = new Dog();
      Animal2 cat = new Cat();
      Animal2 animal = new Animal2();

      System.out.println("Is dog an instance of Animal? " + (dog instanceof Animal2));
      System.out.println("Is dog an instance of Dog? " + (dog instanceof Dog));
      System.out.println("Is dog an instance of Cat? " + (dog instanceof Cat));

      System.out.println("Is cat an instance of Animal? " + (cat instanceof Animal2));
      System.out.println("Is cat an instance of Dog? " + (cat instanceof Dog));
      System.out.println("Is cat an instance of Cat? " + (cat instanceof Cat));

      System.out.println(animal instanceof Animal2);
      System.out.println(animal instanceof Dog);
      System.out.println(animal instanceof Cat);
  }
}
