package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private Color color;

  public Ball (Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public int compareTo(Ball ball){
    return ball.getColor().toString().charAt(0) > this.color.toString().charAt(0) ? -1 : 1; 
  }

  @Override
  public String toString(){
    return "" + this.color + "";
  }

  // List<Ball> -> ordering
  // GREEN -> RED -> YELLOW
public static void main(String[] args) {
  List<Ball> balls = new ArrayList<>();
  balls.add(new Ball(Color.YELLOW));
  balls.add(new Ball(Color.RED));
  balls.add(new Ball(Color.GREEN));
  balls.add(new Ball(Color.BLUE));
  balls.add(new Ball(Color.ORANGE));
  balls.add(new Ball(Color.PINK));
  System.out.println(balls); // [YELLOW, RED, GREEN, BLUE, ORANGE, PINK]

  Collections.sort(balls);
  System.out.println(balls); // [BLUE, GREEN, ORANGE, PINK, RED, YELLOW]
}
}
