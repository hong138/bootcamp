package Quiz3;

enum Color{
  RED(1), YELLOW(2), BLACK(3);

  static int counter = 0;
  int value;

  Color(int i){
    this.value = i;
    counter++;
  }
}

public class Quiz2Q8 {
  public static void main(String[] args) {
    System.out.println(java.awt.Color.counter);
  }
}
