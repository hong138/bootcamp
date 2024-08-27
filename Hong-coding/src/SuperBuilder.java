public class SuperBuilder {
  // public static int counter = 2;
  // private String password;

  // public Password (String x){
  //   this.password = x;
  //   counter++;
  // }

  // public void setPassword(String password){
  //   this.password = password;
  //   counter--;
  // }
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("abc");
    boolean bool = s.append("def").startWith("def");

    System.out.println(bool);
  }
}
