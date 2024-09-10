public class Ball {
  private Ball.Color color;

  public Ball(Color color){
    this.color = color;
  }

  private enum Color{
    RED, GREEN, BLUE;
  }

  public enum Size{
    SMALL, MEDIUM, LARGE;
  }
}
