package animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

  // !!! Ensure every T object has run instance method.
  public static <T extends Animal & Runable> Animal run100m(List<T> animals){
    for (T animal : animals){
      animal.run();
    }
    return null;
  }
  public static void main(String[] args) {
    List<Cat> cats = new ArrayList<>();
  }
}
