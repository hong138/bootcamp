package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SBall implements Comparable<SBall>{
  private Color color;
  private String name;

  public SBall(Color color, String name){
    this.color = color;
    this.name = name;
  }

  public Color getColor(){
    return this.color;
  }

  public String getName(){
    return this.name;
  }

  // public int colorAsc(SBall sball){
  //   return sball.getColor().toString().charAt(0) > this.color.toString().charAt(0) ? 1 : -1;
  // }

  // public int colorDesc(SBall sball){
  //   return sball.getColor().toString().charAt(0) > this.color.toString().charAt(0) ? -1 : 1;
  // }

  // public int nameAsc(SBall sball){
  //   return sball.getName().charAt(0) > this.name.charAt(0) ? 1 : -1;
  // }

  // public int nameDesc(SBall sball){
  //   return sball.getName().charAt(0) > this.name.charAt(0) ? -1 : 1;
  // }

  @Override
  public int compareTo(SBall ball) {
    if (this.color == ball.getColor()){
      return this.name.compareTo(ball.getName());
    } else {

    }
  //   if (this.color.compareTo(sball.getColor()) != 0) {
  //     return this.color.compareTo(sball.getColor());
  // } else {
  //     return sball.getName().compareTo(this.name);
  // }
}

  @Override
  public String toString(){
    return "(" + this.color + ", " + this.name + ")";
  }

  // sorting
  // 1. YELLOW -> GREEN -> RED
  // 2. If same color, name descending order.

  // After sorting
  // i.e. SBall(Yellow, "John") -> SBall (Yellow, "Benny") ->　SBall (Green, "Susan")
  // -> SBall(RED, "Vincent") -> SBall (RED, "Alex")
  public static void main(String[] args) {
    List<SBall> balls = new ArrayList<>();
    balls.add(new SBall(Color.RED, "Vincent"));
    balls.add(new SBall(Color.YELLOW, "Benny"));
    balls.add(new SBall(Color.RED, "Alex"));
    balls.add(new SBall(Color.YELLOW, "John"));
    balls.add(new SBall(Color.GREEN, "Susan"));
    balls.add(new SBall(Color.PINK, "Peter"));
    balls.add(new SBall(Color.ORANGE, "Katie"));
    System.out.println(balls); // [(RED, Vincent), (YELLOW, Benny), (RED, Alex), (YELLOW, John), (GREEN, Susan), (PINK, Peter), (ORANGE, Katie)]

    Collections.sort(balls);
    System.out.println(balls); // [(YELLOW, John), (YELLOW, Benny), (GREEN, Susan), (RED, Vincent), (RED, Alex), (ORANGE, Katie), (PINK, Peter)]

    // balls.colorAsc();
  }
}
