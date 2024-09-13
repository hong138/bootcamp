package Quiz3;

class Animal {
  void eat() {
    System.out.println("[Animal] eating something...");
  }
}

class Cow extends Animal {
  void eat(String food){
    System.out.println("[Cow] eating " + food + "...");
  }
}

class AnimalFarm {
  public static void main(String[] args) {
    Animal cow = new Cow();
    cow.eat("something"); 

    Animal cow2 = new Animal();
    cow2.eat("something"); 
  }
  
}
