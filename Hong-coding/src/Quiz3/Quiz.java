package Quiz3;

class Database {
  private String[] strings;

  Database(String[] strings) {
    this.strings = strings;
  }

  public String[] getStrings() {
    return this.strings;
  }
}

interface Secret {
  void show();
  void hide();
}

class Password implements Secret {
  private String password;

  @Override
  public void show() {
    System.out.println("123");
  }

  Password(String x){
    this.password = x;
  }
}

class Quiz {
  public static void main(String[] args) {
    Database p1 = new Database(new String[] {"ABC", "BCD", "XYZ"});
    Database p2 = p1;
    Database p3 = new Database(new String[] {"ABC", "BCD", "XYZ"});
    String s1 = "ABC";
    String s2 = "ABC";

    System.out.println(p1 == p2); // true
    System.out.println(p2 == p3); // false
    System.out.println(s1 == s2); // true
    System.out.println(s1.equals(p1.getStrings()[1])); // false
    System.out.println(s2.equals(s1)); // true

    Password p1 = new Password("Start");
    p1.show();
  }
}
