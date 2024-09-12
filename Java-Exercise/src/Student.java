public class Student {
  private String name;
  private int score;

  public Student (String name, int score){
    this.name = name;
    this.score = score;
  }

  public int getScore() {
    return this.score;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name + "=" + this.score;
  }
}
