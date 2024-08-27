public enum Direction {
  EAST(1, 'E', "East"), //
  SOUTH(2, 'S', "South"), //
  WEST(3, 'W', "West"), //
  NORTH(4, 'N', "North"),
  ;

  private int value;
  private char initial;
  private String text;

  private Direction (int value, char initial, String text){
    this.value = value;
    this.initial = initial;
    this.text = text;
  }

  public int getValue(){
    return this.value;
  }

  public char getInitial(){
    return this.initial;
  }

  public String getText(){
    return this.text;
  }

  // WEST EAST, NORTH, SOUTH
  public boolean isOppsite(Direction direction){
    return (this.getValue() + direction.getValue()) % 2 == 0 && this != direction;
  }

  public static void main(String[] args) {
    // defind a variable storing Direction WEST

    // Direction east = Direction.EAST;
    Direction south = Direction.SOUTH;
    Direction west = Direction.WEST;
    Direction north = Direction.NORTH;

    if (west == Direction.NORTH){
      System.out.println("it is North.");
    } else{
      System.out.println("It is not a North.");
    }

    // checking if this variable equals to NORTH
      // if yes, print "it is North."
      // if no, print "it is not a North"

    // valueOf()
    Direction east = Direction.valueOf("EAST");
    System.out.println(east);

    // System.out.println(Direction.valueOf("south")); // case sensitive
    // runtime exception

    System.out.println((Direction.WEST.isOppsite(Direction.EAST))); // true
    System.out.println((Direction.SOUTH.isOppsite(Direction.EAST))); // false
    System.out.println((Direction.NORTH.isOppsite(Direction.SOUTH))); // true
    System.out.println((Direction.WEST.isOppsite(Direction.WEST))); // false

  }
}


