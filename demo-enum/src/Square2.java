public class Square2 {
  private double length;
  private Color2 color; // enum

  public Square2(double length, Color2 color){
    this.length = length;
    this.color = color;
  }

  public static void main(String[] args) {
    Square2 s1 = new Square2(6.4d, Color2.BLUE);
    System.out.println(Color2.BLUE);
  }
}
