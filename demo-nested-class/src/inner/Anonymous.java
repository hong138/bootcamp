package inner;

public class Anonymous {
  public static void main(String[] args) {
    Readable person = new Readable(){
    @Override
    public void read(){
      System.out.println("I'm reading...");
    }
  };

  person.read();
  System.out.println(person.getClass());
  }
}
