import java.util.Objects;

public class Subject {
  private int score;
  private String des;

  public Subject(int score, String des){
    this.score = score;
    this.des = des;
  }

  public int getScore(){
    return this.score;
  }

  public String getDes(){
    return this.des;
  }

  public void setScore(int score){
    this.score = score;
  }

  public void setDes(String des){
    this.des = des;
  }

  @Override
  public String toString(){
    return "Score(score= " + this.score + ", (description= " + this.des + ")";
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Subject))
      return false;
    Subject subject = (Subject) obj;
    return Objects.equals(this.des, subject.getDes()) && Objects.equals(this.score, subject.getScore());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.des, this.score);
  }
}
