public class SmallPerson extends Person{

  // Cannot override
  // @Override
  // public void walk();

  public static void main(String[] args) {
    SmallPerson sp = new SmallPerson();
    sp.walk();
  }
}
