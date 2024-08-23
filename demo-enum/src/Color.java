public class Color {
  
  private static final String RED = "RED";
  private static final String BLUE = "BLUE";
  private static final String GREEN = "GREEN";

  private String value;

  private Color(String value){
    this.value = value;
  }

  public String toString(){
    return "(" + this.value + ")";
    }

  public static Color ofRed(){
    return new Color("RED");
  }

  public static Color ofBlue(){
    return new Color("BLUE");
  }

  public static Color ofGreen(){
    return new Color("GREEN");
  }

  public void updateColor(int x){
    if (x > 0){
      this.value = RED;
    this.value = BLUE;
    }
  }

  public String getColor(){
    return this.value;
  }
}
