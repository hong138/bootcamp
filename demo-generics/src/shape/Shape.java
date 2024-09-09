package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Shape {
  private Color color;

  abstract double area();

  // With Generics (lower boundary - <T extends Shape>)
  // !!!!!! List<Shape> OR List<Circle> OR List<Square>
  public static <T extends Shape> double totalArea(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // Without Generics 
  // !!!!!! List<Shape>
  public static double totalArea2(List<Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

    // Without Generics (upper boundary - <? super Shape>)
    // !!! What object can we pass into this method
    // !!!!!! List<Shape> OR ..... List<Any Parent Type of Shape>
    public static double totalArea3(List<? super Shape> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {

    }
    return bd.doubleValue();
    }

    public static void main(String[] args) {
      List<Shape> shapes = new ArrayList<>(
        Arrays.asList(new Circle(3.0), new Square(3.0), new Circle(4.0)));
      System.out.println(totalArea2(shapes)); //87.53981633974483

      List<Circle> circles = new ArrayList<>(
        Arrays.asList(new Circle(3.0), new Circle(3.0), new Circle(4.0)));
      System.out.println(totalArea2(shapes)); 

      System.out.println(totalArea(shapes));
      System.out.println(totalArea(circles));
    }
}
