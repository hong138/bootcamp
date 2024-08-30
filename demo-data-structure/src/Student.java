import java.util.ArrayList;

// Student.class and ArrayList<Subject> attribute -> 2 objects (A Student consist of/ has many subjects)
// Student.class extends Subject.class -> 1 object (Student is a subject)

public class Student{
  private String name;
  private ArrayList<Subject> subjects;

  public Student(){}

  public Student(String name, ArrayList<Subject> subjects) {
    this.name = name;
    this.subjects = new ArrayList<>(); // Encapsulate Data Structure. No impact to user if I change array.
  }

  public ArrayList<Subject> subjects(){
    return this.subjects;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int totalScore(){
    int sum = 0;
    for (Subject subject : this.subjects){
      sum += subject.getScore();
    }
    return sum;
  }

  public boolean add(Subject subject){
    return this.subjects.add(subject);
  }

  public boolean drop(Subject subject){
    return this.subjects.remove(subject);
  }

  public Subject drop(int index){
    return this.subjects.remove(index);
  }

  @Override
  public String toString(){
    return "Student(name=" + this.name + subjects.toString() + ")";
  }

  public static void main(String[] args) {
    // Revise the design so that we can add extra subject to an existing student
    Student kenny = new Student("Kenny");
    kenny.add(new Subject(90, "English"));
    kenny.add(new Subject(80, "Maths"));

    kenny.drop("English");

  }
}