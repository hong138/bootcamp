import java.math.BigDecimal;

public class Square {
  private double length;
  private Color color;

  public Square(double length, Color color){
    this.length = length;
    this.color = color;
  }

  // Square.OfRed(3)
  public static Square ofRed(int length){
    return new Square(length, Color.ofRed());
  }

  // getter and constructor

  public double getLength(){
    return this.length;
  }  

  public Color getColor(){
    return this.color;
  }

  public double getArea(){
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }

  public double getPerimeter(){
    return BigDecimal.valueOf(this.length).add(BigDecimal.valueOf(this.length)).multiply(BigDecimal.valueOf(2)).doubleValue();
  }

  public static void main(String[] args) {
    Square s1 = new Square(3.0, Color.ofBlue());
    Square s2 = new Square(5.0, Color.ofGreen());
    Square s3 = new Square(7.0, Color.ofRed());
    Square s4 = Square.ofRed(8);

    System.out.println(s1.getColor());
    System.out.println(s1.getArea());
    System.out.println(s1.getPerimeter());

    System.out.println(s4);

    // Do we really need more than one RED color object?
  }
}
