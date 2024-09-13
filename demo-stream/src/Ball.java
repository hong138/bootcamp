
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Ball {
  private Color color;
  private int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value; 
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    return this.color + " " + this.value;
  }

  public static enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, BLACK, WHITE;
  }

  public static void main(String[] args) {
    List<Ball> balls = List.of(new Ball(Color.RED, 3), new Ball(Color.RED, 7)
                             , new Ball(Color.BLUE, 2), new Ball(Color.BLUE, 1)
                             , new Ball(Color.GREEN, 89), new Ball(Color.GREEN, 64));
    Map<Color, List<Ball>> ballMap = balls.stream().collect(Collectors.groupingBy(e -> e.getColor()));
    System.out.println(ballMap.size()); // 3
    System.out.println(ballMap.get(Color.RED)); // [RED 3, RED 7]

    // Sum
    Map<Color, Integer> valueMapSum = balls.stream()
                                   .collect(Collectors.groupingBy(e -> e.getColor()
                                   , Collectors.summingInt(e -> e.getValue())));
    System.out.println(valueMapSum.get(Color.GREEN)); // 153

    // Average
    Map<Color, Double> valueMapAverage = balls.stream()
                                   .collect(Collectors.groupingBy(e -> e.getColor()
                                   , Collectors.averagingInt(e -> e.getValue())));
    System.out.println(valueMapAverage.get(Color.GREEN)); // 76.5

    // Find the ball with max value for a given color
    // maxBy
    Map<Color, Optional<Ball>> valueMapMax = balls.stream()
                                      .collect(Collectors.groupingBy(e -> e.getColor()
                                      , Collectors.maxBy(Comparator.comparingInt(e -> e.getValue()))));
    System.out.println(valueMapMax.get(Color.GREEN)); // Optional[GREEN 89]

    // BLUE -> max value 2
    OptionalInt optInt = balls.stream()
                        .filter(e -> e.getColor() == Color.BLUE)
                        .mapToInt(e -> e.getValue())
                        .max(); // !!! return OptionalInt object, because balls maybe size 0
    if (optInt.isPresent()) {
      System.out.println(optInt.getAsInt()); // 2
    } else {
      System.out.println("No BLUE ball");
    }


    // minBy
    Map<Color, Optional<Ball>> valueMapMin = balls.stream()
                                            .collect(Collectors.groupingBy(e -> e.getColor()
                                            , Collectors.minBy(Comparator.comparingInt(e -> e.getValue()))));
    System.out.println(valueMapMin.get(Color.RED)); // Optional[RED 3]

    // Partition By (separated all elements into 2 groups)
    Map<Boolean, List<Ball>> ballValue = balls.stream().collect(Collectors.partitioningBy(b -> b.getValue() > 5));
    System.out.println(ballValue); // {false=[RED 3, BLUE 2, BLUE 1], true=[RED 7, GREEN 89, GREEN 64]}
  }
}
